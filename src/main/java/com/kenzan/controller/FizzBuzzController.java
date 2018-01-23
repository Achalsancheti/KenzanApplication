package com.kenzan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kenzan.service.FizzBuzzService;

@RestController
@RequestMapping("/fizzbuzz")
public class FizzBuzzController {

	@Autowired
	FizzBuzzService fizzBuzzService;
	
	@RequestMapping(value = {"/"})
	public String handleError(){
		return "Please Enter a Number After '/fizzbuzz/'";
	}
	
	@RequestMapping(method = RequestMethod.GET, value= "/{number}")
	public Object getFizzBuzz(@PathVariable("number") String number){
		if(number.matches("[0-9]+")){
			if(Integer.parseInt(number) <= 100){
				return fizzBuzzService.fizzBuzz(Integer.parseInt(number));
			}else{
				return "Please Enter Number Less Than or Equal to 100";
			}
		}else{
			return "Please Enter a Number Rather Than String";
		}		
	}
	
}
