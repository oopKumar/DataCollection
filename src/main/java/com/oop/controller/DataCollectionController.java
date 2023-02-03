package com.oop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oop.service.DataCollectionService;

@RestController
public class DataCollectionController {
	
	@Autowired
	DataCollectionService dataCollectionService;
	
	@GetMapping("/createCase")
	public Integer createCase() {
		return 1;
	}

}
