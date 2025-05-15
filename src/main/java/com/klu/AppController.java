package com.klu;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AppController {
	@GetMapping("/sub/{a}/{b}")
   public String sub(@PathVariable("a") int a, @PathVariable("b") int b)
   {
	   return "Subtraction of two numbers are  : " +(a-b);
   }
}
