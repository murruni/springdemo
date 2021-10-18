package com.example.controller.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller.RestControllerBase;

@RestController
@RequestMapping("/api/hello")
public class HelloRestController extends RestControllerBase {

	@RequestMapping("/")
	public String index() {
		return "Hello World!";
	}
}
