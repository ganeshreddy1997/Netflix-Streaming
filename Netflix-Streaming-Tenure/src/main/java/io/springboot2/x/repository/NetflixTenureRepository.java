package io.springboot2.x.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.springboot2.x.domain.NetflixTenure;

public interface NetflixTenureRepository extends JpaRepository<NetflixTenure, Integer> {

	
	List<NetflixTenure> findByMobileNo(String mobileNo);
}
