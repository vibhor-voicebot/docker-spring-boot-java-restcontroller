package com.levo.dockerexample.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("docker-java-app")
public class HelloController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "docker-java-app is up and running: " + new Date();
	}


    @RequestMapping("/hello/{id}")
    public String hello2(@PathVariable("id") long id) throws InterruptedException {
        Thread.sleep(id);
        return "Hello Thread woke up after secs - " + id;
    }

}
