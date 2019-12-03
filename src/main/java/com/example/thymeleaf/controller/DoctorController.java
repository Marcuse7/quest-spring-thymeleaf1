package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

	@GetMapping("/doctor")
	public String doctor(Model model,
			@RequestParam(value = "name", required = true, defaultValue = "John Smith") String param_name,
			@RequestParam(value = "number", required = true, defaultValue = "0") String param_number) {

		model.addAttribute("doctorname", param_name);
		model.addAttribute("doctornumber", param_number);

		return "doctor";
	}
}
