package com.kenzan.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
	
	public Map<String, List<Integer>> fizzBuzz(int n) {
		
		/*Map to store unique string value i.e. Fizz, Buzz and FizzBuzz
		  along with a list of integers
		*/
		Map<String, List<Integer>> map = new HashMap<>();
		
		/*Creating 3 list of integers for Fizz, Buzz and FizzBuzz*/
	    List<Integer> fizz = new ArrayList<>(),
	            buzz = new ArrayList<>(),
	            fizzbuzz = new ArrayList<>();
	    
	    //Using streams for range 1 to n
	    IntStream.rangeClosed(1, n).forEachOrdered(i -> {
	        boolean f = i % 3 == 0, b = i % 5 == 0;
	        if (f && b) {
	            fizzbuzz.add(i);
	        } else if (f) {
	            fizz.add(i);
	        } else if (b) {
	            buzz.add(i);
	        }
	    });
	    
	    //Putting the value of lists in the map along with a unique key
	    map.put("Fizz", fizz);
	    map.put("Buzz", buzz);
	    map.put("FizzBuzz", fizzbuzz);
	    
	    return map;
	}

}
