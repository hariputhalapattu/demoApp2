package com.demoapp2.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoapp2controller {
	@GetMapping("/demoApp2")
	  public String getMessage() {
		  return "Hello World from demoapp2";
	  }
}
