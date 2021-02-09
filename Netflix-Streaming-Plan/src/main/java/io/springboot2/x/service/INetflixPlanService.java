package io.springboot2.x.service;

import java.util.List;

import io.springboot2.x.entity.NetflixPlan;

public interface INetflixPlanService {
	
	List<NetflixPlan> getAllPlans();
	NetflixPlan getPlanById(String planId);
	String updatePlan(NetflixPlan np);
	String addPlan(NetflixPlan np);
	String deletePlanById(String planId);
	
	

}
