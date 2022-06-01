package com.demo;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Client2Application {
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private DiscoveryClient client;
	
	public String invokeGreetingService() {
		URI uri = client.getInstances("GClient1-service").stream().map(si -> si.getUri()).findFirst()
				.map(s -> s.resolve("/message")).get();
		return template.getForObject(uri,  String.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Client2Application.class, args);
	}

}
