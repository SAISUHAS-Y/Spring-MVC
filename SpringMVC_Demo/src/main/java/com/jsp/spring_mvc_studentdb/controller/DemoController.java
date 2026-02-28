package com.jsp.spring_mvc_studentdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class DemoController {
	@RequestMapping("/anything")
	public ModelAndView print(@RequestParam int id,@RequestParam String name) {
		ModelAndView mov=new ModelAndView();
		mov.setViewName("output.jsp");
		mov.addObject("key1",id);
		mov.addObject("key2",name);

		return mov;
	}
}
