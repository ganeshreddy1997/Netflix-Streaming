package io.springboot2.x.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import io.springboot2.x.entity.NetflixUserEntity;
import io.springboot2.x.service.INetflixUserService;

@RestController
public class NetflixUserController {

	@Autowired
	INetflixUserService service;
	
	@PostMapping("/user/addUser")
	public ResponseEntity<NetflixUserEntity> addNetflixUser(@RequestBody NetflixUserEntity entity){
		return	new ResponseEntity<NetflixUserEntity>(entity, HttpStatus.OK);
	}
	
	@GetMapping("/user/getUser/{phoneNor}")
	public ResponseEntity<NetflixUserEntity> getNetflixUser(@PathVariable String phoneNor){
		return new ResponseEntity<NetflixUserEntity>(service.getUser(phoneNor), HttpStatus.OK);	
	}
	
	@PutMapping("/user/update")
	public ResponseEntity<String> updateNetflixUser(@RequestBody NetflixUserEntity entity){
		return new ResponseEntity<String>(service.updateUser(entity), HttpStatus.OK);
	}
	
	@DeleteMapping("/user/phoneNor")
	public ResponseEntity<String> deleteNetflixUser(@PathVariable String phoneNor){
		return new ResponseEntity<String>(service.deleteUser(phoneNor), HttpStatus.OK);
		
	}
	
}
