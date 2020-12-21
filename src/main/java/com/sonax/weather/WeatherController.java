package com.sonax.weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.json.XML;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


@Controller
@RequestMapping("/weather")
public class WeatherController {
	
	private static final Logger logger = LoggerFactory.getLogger(WeatherController.class);

	@RequestMapping("/weatherPage.do")
	public String weatherPage() {
		try {
			URL url = new URL("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1159068000");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			/*BufferedReader br =  new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String txt = "";
			while((txt = br.readLine()) != null) {
				System.out.println(txt);
			}*/
			// conn.getResponseCode() == 200 && conn.getInputStream() != null 
			InputStream input = conn.getInputStream();
			
			String xml = IOUtils.toString(input);
			JSONObject jObj = XML.toJSONObject(xml);
			/*String jsontxt = jObj.toString(4);
			System.out.println(jsontxt);
			*/
			String jsonStr = jObj.toString();
			
			ObjectMapper mapper = new ObjectMapper();
			
			Map<String, Object> map = new HashedMap<>();
			map = mapper.readValue(jsonStr, new TypeReference<Map<String,Object>>(){});
			Map<String, Object> rss = (Map<String, Object>) map.get("rss");
			//Map<String, Object> body = (Map<String, Object>) rss.get("rss");
			Map<String, Object> channel = (Map<String, Object>) rss.get("channel");
			Map<String, Object> item = (Map<String, Object>) channel.get("item");
			Map<String, Object> description = (Map<String, Object>) item.get("description");
			Map<String, Object> body = (Map<String, Object>) description.get("body");
			Map<String, Object> data = (Map<String, Object>) body.get("data");
			
			List<Map<String, Object>> weatherData = new ArrayList<>();
			
			weatherData.add(data);
			System.out.println(data);
			/*
			 * 전체 출력
			 * mapper.enable(SerializationFeature.INDENT_OUTPUT);
			Object json = mapper.readValue(jObj.toString(), Object.class);
			String output = mapper.writeValueAsString(json);
			System.out.println(output);*/
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "weather";
	}
	
	public JSONObject xmlToJson(HttpURLConnection conn) {
		try {
			
			BufferedReader br =  new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String txt = "";
			String xmlTxt = "";
			while((txt = br.readLine()) != null) {
				xmlTxt = xmlTxt.concat(txt);
			}
			InputStream input = conn.getInputStream();
			JSONParser parser = new JSONParser();
			JSONObject jObj = (JSONObject) parser.parse(xmlTxt);
			
			System.out.println(jObj.toString());
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
