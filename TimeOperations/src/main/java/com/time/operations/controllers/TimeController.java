package com.time.operations.controllers;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("time")
public class TimeController {
	
	@Autowired
	TimeService timeService;
	
	@GetMapping(path = "currenttimeinwords")
	public ResponseEntity<String> getCurrentTimeInWords(){
		Calendar cd = Calendar.getInstance();
		return new ResponseEntity<String>(timeService.getCurrentTimeInWords(cd.get(Calendar.HOUR_OF_DAY), cd.get(Calendar.MINUTE)),HttpStatus.OK);
	}
}
