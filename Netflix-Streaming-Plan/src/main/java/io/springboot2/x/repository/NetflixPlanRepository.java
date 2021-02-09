package io.springboot2.x.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.springboot2.x.entity.NetflixPlan;

public interface NetflixPlanRepository extends JpaRepository<NetflixPlan, String> {

}
