package com.learn.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 1
@RestController
@RequestMapping("/users")
public class UserController {

	// 3
	@PostMapping

	// 2
	public String createUser(@RequestBody String name) { // a // b: @RequestBody String name
		String result = null; // b
		result = "createUser() 호출 : " + name; // d
		return result; // c: 반환
	}

	// 5
	@GetMapping
	// 4
	public String getAllUsers() { // a
		String result = null; // b
		result = "getAllUsers() 호출 : "; // d
		return result; // c
	}

	// 7
	@GetMapping("/{id}")
	// 6
	public String getUserById(@PathVariable Long id) { // a
		String result = null; // b
		result = "getUserById() 호출 : " + id; // d
		return result; // c
	}

	// 9
	@PutMapping("/{id}")

	// 8
	public String updateUser(@PathVariable Long id) { // a
		String result = null; // b
		result = "updateUser() 호출 : " + id; // d
		return result; // c
	}

	// 11
	@DeleteMapping("/{id}")

	// 10
	public String deleteUser(@PathVariable Long id) { // a
		String result = null; // b
		result = "deleteUser() 호출 : " + id; // d
		return result; // c
	}

}