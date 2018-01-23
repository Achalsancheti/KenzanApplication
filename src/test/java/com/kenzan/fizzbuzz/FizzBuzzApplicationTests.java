package com.kenzan.fizzbuzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.kenzan.service.FizzBuzzService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FizzBuzzApplication.class)
@ContextConfiguration
public class FizzBuzzApplicationTests {

	@Autowired
	FizzBuzzService fizzBuzzService;
	
	@Test
	public void checkFizzBuzzFor1() {
		Map<String, List<Integer>> map = new HashMap<>();
		List<Integer> fizz = new ArrayList<>(),
	            buzz = new ArrayList<>(),
	            fizzbuzz = new ArrayList<>();
	    map.put("Fizz", fizz);
	    map.put("Buzz", buzz);
	    map.put("FizzBuzz", fizzbuzz);
		Assert.assertEquals(map, fizzBuzzService.fizzBuzz(1));
	}
	
	@Test
	public void checkFizzBuzzFor3() {
		Map<String, List<Integer>> map = new HashMap<>();
		List<Integer> fizz = new ArrayList<>(),
	            buzz = new ArrayList<>(),
	            fizzbuzz = new ArrayList<>();
		fizz.add(3);
	    map.put("Fizz", fizz);
	    map.put("Buzz", buzz);
	    map.put("FizzBuzz", fizzbuzz);
		Assert.assertEquals(map, fizzBuzzService.fizzBuzz(3));
	}
	
	@Test
	public void checkFizzBuzzFor5() {
		Map<String, List<Integer>> map = new HashMap<>();
		List<Integer> fizz = new ArrayList<>(),
	            buzz = new ArrayList<>(),
	            fizzbuzz = new ArrayList<>();
		fizz.add(3);
		buzz.add(5);
	    map.put("Fizz", fizz);
	    map.put("Buzz", buzz);
	    map.put("FizzBuzz", fizzbuzz);
		Assert.assertEquals(map, fizzBuzzService.fizzBuzz(5));
	}
	
	@Test
	public void checkFizzBuzzFor15() {
		Map<String, List<Integer>> map = new HashMap<>();
		List<Integer> fizz = new ArrayList<>(),
	            buzz = new ArrayList<>(),
	            fizzbuzz = new ArrayList<>();
		fizzbuzz.add(15);
	    map.put("Fizz", fizz);
	    map.put("Buzz", buzz);
	    map.put("FizzBuzz", fizzbuzz);
		Assert.assertNotSame(map, fizzBuzzService.fizzBuzz(15));
	}
	
	@Test
	public void checkFizzBuzzForAllValues() {
		Map<String, List<Integer>> map = new HashMap<>();
		List<Integer> fizz = new ArrayList<>(),
	            buzz = new ArrayList<>(),
	            fizzbuzz = new ArrayList<>();
		fizz.add(3);
		fizz.add(6);
		fizz.add(9);
		fizz.add(12);
		buzz.add(5);
		buzz.add(10);
		fizzbuzz.add(15);
	    map.put("Fizz", fizz);
	    map.put("Buzz", buzz);
	    map.put("FizzBuzz", fizzbuzz);
		Assert.assertEquals(map, fizzBuzzService.fizzBuzz(15));
	}

}
