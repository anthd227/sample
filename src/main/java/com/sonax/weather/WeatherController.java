package com.sonax.weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
import com.fasterxml.jackson.databind.SerializationFeature;


@Controller
@RequestMapping("/weather")
public class WeatherController {
	
	private static final Logger logger = LoggerFactory.getLogger(WeatherController.class);

	@RequestMapping("/weatherPage.do")
	public String weatherPage() {
		try {
			getWeather("1132068000", "local");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "weather";
	}
	
	public void getWeather(String localCode, String type) throws IOException {
		String urlTxt = "";
		if(type.equals("midTerm")) {
			urlTxt = "https://www.weather.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=";
		} else {
			urlTxt = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=";
		}
		URL url = new URL(urlTxt + localCode);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		if(conn.getResponseCode() == 200 && conn.getInputStream() != null) {
			InputStream input = conn.getInputStream();
			
			String xml = IOUtils.toString(input);
			JSONObject jObj = XML.toJSONObject(xml);
			
			String jsonStr = jObj.toString();
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Object> map = new HashedMap<>();
			map = mapper.readValue(jsonStr, new TypeReference<Map<String,Object>>(){});
			
			//전체출력
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			Object json = mapper.readValue(jObj.toString(), Object.class);
			String output = mapper.writeValueAsString(json);
			System.out.println(output);
			
			Map<String, Object> rss = (Map<String, Object>) map.get("rss");
			Map<String, Object> channel = (Map<String, Object>) rss.get("channel");
			Map<String, Object> item = (Map<String, Object>) channel.get("item");
			Map<String, Object> description = (Map<String, Object>) item.get("description");
			Map<String, Object> body = (Map<String, Object>) description.get("body");
			
			List<Map<String, Object>> data = null;
			if(type.equals("midTerm")) {
				data = (List<Map<String, Object>>) body.get("location");
			} else {
				data = (List<Map<String, Object>>) body.get("data"); 
			}
			
			for(int ii = 0; ii < data.size(); ii++) {
				Map<String, Object> weatherData = data.get(ii);
				System.out.println(weatherData);
			}
		}
	}
}
