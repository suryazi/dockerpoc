package com.bab.dockerpoc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DockerPocController {
	
	@RequestMapping(value = "/index")
	public String index() {
		return "views/index";
	}

}
