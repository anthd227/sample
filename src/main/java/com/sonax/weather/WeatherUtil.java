package com.sonax.weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

public class WeatherUtil {

	public static void main(String[] args) {
		try {
			//getWeather("109", "midTerm");
			 getOpenAPIdata();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getWeather(String localCode, String type) throws IOException {
		String urlTxt = "";
		if(type.equals("midTerm")) { // 중기예보
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
			//System.out.println(output);
			
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
				if(weatherData.get("city").equals("의왕")) {
					System.out.println(weatherData);
				}
			}
		}
		
	}
	
	public static void getOpenAPIdata() throws Exception {
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/VilageFcstInfoService/getVilageFcst"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=37FrLbpDFWXc10fObIANnaC3YJ7gmTU41nQrmXuaptS8LUzd3prOnEZhzYnhbb4iBfmNAf4k5ux%2FkcqbrH1XpQ%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("XML", "UTF-8")); /*요청자료형식(XML/JSON)Default: XML*/
        urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode("20201224", "UTF-8")); /*15년 12월 1일 발표*/
        urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode("0500", "UTF-8")); /*06시 발표(정시단위)*/
        urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode("58", "UTF-8")); /*예보지점의 X 좌표값*/
        urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode("125", "UTF-8")); /*예보지점 Y 좌표*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
     
        rd.close();
        conn.disconnect();
        
        System.out.println(sb.toString());
        System.out.println(urlBuilder.toString());
		
        
        
	}
}
