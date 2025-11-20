package com.excelr.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
	
	
	@GetMapping("/jen")
	public String sampleMsg()
	{
		String s1="welcome to springboot jenkins app";
		return s1;
	}

}
