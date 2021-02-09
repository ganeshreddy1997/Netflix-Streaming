package io.springboot2.x.service;

import java.util.List;

import io.springboot2.x.domain.NetflixTenure;

public interface INetflixTenureService {
List<NetflixTenure> readByMobileNo(String mobileNo);
Boolean addTenure(NetflixTenure tenure);
Boolean updateTenure(NetflixTenure tenure);
Boolean deleteById(Integer id);
List<NetflixTenure> readAllTenures();
	
	
	
}
