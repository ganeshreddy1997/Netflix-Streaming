package io.springboot2.x.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.springboot2.x.entity.NetflixPlan;
import io.springboot2.x.service.INetflixPlanService;

@RestController
public class NetflixPlanController {
	
	
	@Autowired
    INetflixPlanService service;
	
	@GetMapping("/plan/all")
	ResponseEntity<List<NetflixPlan>> getAllPlans(){
		return new ResponseEntity<List<NetflixPlan>>(service.getAllPlans(),HttpStatus.OK);
	}
	@GetMapping("/plan/{planId}")
	ResponseEntity<NetflixPlan> getPlanById(@PathVariable String planId){
		return new ResponseEntity<NetflixPlan>(service.getPlanById(planId),HttpStatus.OK);	
	}
	@PostMapping("/plan/add")
	ResponseEntity<String> addPlan(@RequestBody NetflixPlan np){
		return new ResponseEntity<String>(service.addPlan(np),HttpStatus.OK);
	}
	@DeleteMapping("/plan/delete")
	ResponseEntity<String> deletePlan(@RequestParam String planId){
		return new ResponseEntity<String>(service.deletePlanById(planId),HttpStatus.OK);
	}
	@PutMapping("/plan/update")
	ResponseEntity<String> updatePlan(@RequestBody NetflixPlan np){
		return new ResponseEntity<String>(service.updatePlan(np),HttpStatus.OK);
		
	}
}
