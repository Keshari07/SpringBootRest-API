package com.cdac.cine.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloWorldController {
//Request mapping 	
  
//  @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
//	public String helloworld() {
//		return "Hello World";
	
	
//  @GetMapping(path = "/hello-world")
//	public String helloworld() {
//		return "Hello World I am Keshribhan Suryavanshi";
//	
//	}
//  @GetMapping(path = "/hello-world-bean")
//	public HelloWorldBean helloworldBean() {
//		return new HelloWorldBean("Hello World I am Keshribhan Suryavanshi");
//	
//	}
     
      //Path Parameters
     // /users/{id}/todos/{id} => /users/2/todos/200
   // /hello-world/path-variable/{name}
  // /hello-world/path-variable/Ranga
        
  @GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloworldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
		
	
	}

  
	
}
