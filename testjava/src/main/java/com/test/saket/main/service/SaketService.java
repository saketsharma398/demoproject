package com.test.saket.main.service;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SaketService {

	@Autowired
	RestTemplate RestTemplate;
	public String testMethod()  throws IOException{
		
		
		  URL url = new URL("https://www.google.com");
	        URLConnection yc = url.openConnection();
	        BufferedReader in = new BufferedReader(new InputStreamReader(
	                                    yc.getInputStream()));
	          
	          String inputLine;
	         inputLine = in.readLine();
	         System.out.println(inputLine);
	        
	         
	        
	         in.close();
	         return inputLine;
	}
		
	}

