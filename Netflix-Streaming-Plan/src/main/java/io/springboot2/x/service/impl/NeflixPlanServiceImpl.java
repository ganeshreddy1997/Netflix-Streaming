package io.springboot2.x.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springboot2.x.entity.NetflixPlan;
import io.springboot2.x.repository.NetflixPlanRepository;
import io.springboot2.x.service.INetflixPlanService;
@Service
public class NeflixPlanServiceImpl implements INetflixPlanService {

	@Autowired
	NetflixPlanRepository repo;
	
	@Override
	public List<NetflixPlan> getAllPlans() {
		
		return repo.findAll();
	}

	@Override
	public NetflixPlan getPlanById(String planId) {
		if(repo.existsById(planId)) {
		return repo.findById(planId).get();
		}return null;
	}

	@Override
	public String updatePlan(NetflixPlan np) {
		if(repo.existsById(np.getPlanId())==true) {
			repo.saveAndFlush(np);
			return "your plan is updated successfully";
			
		}
		return "id not found";
	}

	@Override
	public String addPlan(NetflixPlan np) {
		if(repo.existsById(np.getPlanId())==false) {
			repo.save(np);
			return "your plan is added successfully";
			
		}
		return "id is already exist";
	}

	@Override
	public String deletePlanById(String planId) {
		if(repo.existsById(planId)==true) {
			repo.deleteById(planId);
			return "your plan is deleted successfully";
			
		}
		return "id not found";
	}

}
