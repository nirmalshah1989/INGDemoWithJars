package com.tcs.common.dependency1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dependent1")
public class ProductController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody String getHello() {

		return "Hello from Dependency-1";
	}
}
