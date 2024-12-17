package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.User;

@Service
public class DemoService {

	private final RestTemplate restTemplate;
	
	@Autowired
	public DemoService(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	
	public List<User> fetchUsers(){
		String url = "https://jsonplaceholder.typicode.com/users";
		
		User[] users = restTemplate.getForObject(url, User[].class);
		return Arrays.asList(users);
	}
}
