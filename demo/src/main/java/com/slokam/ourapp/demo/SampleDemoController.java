package com.slokam.ourapp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("onet")
public class SampleDemoController {

	@GetMapping("getData")
	public String getData() {
		return "How How are you? from SampleDemoController";
	}
}
