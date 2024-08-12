package com.abhishekvermaa10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author abhishekvermaa10
 *
 */
@Controller
public class HomeController {
	@GetMapping
	public String hoistFlag() {
		return "flag";
	}
}
