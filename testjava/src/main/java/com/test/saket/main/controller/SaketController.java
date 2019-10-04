package com.test.saket.main.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.saket.main.service.SaketService;


@RestController
public class SaketController {

	@Autowired
	SaketService saketService;
	
	
	@RequestMapping(value="/getmapping", method = RequestMethod.GET,produces = "application/json")
	public String testMethod() throws IOException {
		return saketService.testMethod();
	}
//	@RequestMapping(value="/postmapping", method = RequestMethod.GET)
//	public String testMethod1() {
//		return "Saket's Post Mapping propgram";
//	}
}
