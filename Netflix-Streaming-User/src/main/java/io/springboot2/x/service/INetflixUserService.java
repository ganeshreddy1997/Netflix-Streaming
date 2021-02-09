package io.springboot2.x.service;

import io.springboot2.x.entity.NetflixUserEntity;

public interface INetflixUserService {
	
	public String addUser(NetflixUserEntity entity);
	public NetflixUserEntity getUser(String phoneNor);
	public String updateUser(NetflixUserEntity entity);
	public String deleteUser(String phoneNor);

}
