package kh.lclass.incheonairport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class ICNAirPort {


		 public static void main(String[] args) throws IOException {
		        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551177/FacilitiesInformation/getFacilitesInfo"); /*URL*/
		        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=kRsT9NIhrHgcUIT0MItkMywlOeKWuTPjY1JLy0UFKoflI%2FQIWUQ8VxhpSt6aPr2zEcrsnJlyk6peyGwfUZ%2Ba0g%3D%3D"); /*Service Key*/
		        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*데이터 행*/
		        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*데이터 표출 페이지 수*/
		        urlBuilder.append("&" + URLEncoder.encode("lang","UTF-8") + "=" + URLEncoder.encode("E", "UTF-8")); /*K: 국문, E: 영문, J: 일문, C: 중문*/
		        urlBuilder.append("&" + URLEncoder.encode("lcduty","UTF-8") + "=" + URLEncoder.encode("Y", "UTF-8")); /*Y:면세지역, N:일반지역*/
		        urlBuilder.append("&" + URLEncoder.encode("facilitynm","UTF-8") + "=" + URLEncoder.encode("EXIT", "UTF-8")); /*시설명 및 매장명*/
		        urlBuilder.append("&" + URLEncoder.encode("arrordep","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*A:입국장, D:출국장*/
		        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8")); /*응답유형 [xml, json] default=xml*/
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
		    }
	}


