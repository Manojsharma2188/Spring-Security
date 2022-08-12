package com.manoj.java11.httpClient;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClient {

	public static void main(String[] args) {

		java.net.http.HttpClient htc = java.net.http.HttpClient.newBuilder().
				version(java.net.http.HttpClient.Version.HTTP_2).connectTimeout(Duration.ofSeconds(10))
				.build();
		try {
			HttpRequest hrq = HttpRequest.newBuilder()
		            .GET()
		            .uri(URI.create("https://www.google.com"))
		            .build();    
			
			HttpResponse<String> response = htc.send(hrq, HttpResponse.BodyHandlers.ofString());
			System.out.println("Status Code " + response.statusCode());
			System.out.println("Header " + response.headers().allValues("content-type"));
	        System.out.println("Body: " + response.body());

		}
		catch(Exception e) {
			e.getMessage();
		}
		
	}

}
