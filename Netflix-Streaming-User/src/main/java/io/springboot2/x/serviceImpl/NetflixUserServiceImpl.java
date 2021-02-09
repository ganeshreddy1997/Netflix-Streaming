package io.springboot2.x.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springboot2.x.entity.NetflixUserEntity;
import io.springboot2.x.repository.NetflixUserEntityRepository;
import io.springboot2.x.service.INetflixUserService;
@Service
public class NetflixUserServiceImpl implements INetflixUserService {
	
	@Autowired
	NetflixUserEntityRepository repo;

	@Override
	public String addUser(NetflixUserEntity entity) {
		if(repo.existsById(entity.getPhoneNor())==false) {
		repo.save(entity);
		return "user added sucessfully";
		}return "user is already exist";
	}

	@Override
	public NetflixUserEntity getUser(String phoneNor) {
		if(repo.existsById(phoneNor)==true) {
			return repo.findById(phoneNor).get();
		}
		return null;
	}

	@Override
	public String updateUser(NetflixUserEntity entity) {
		if(repo.existsById(entity.getPhoneNor())==true) {
			repo.saveAndFlush(entity);
			return "user details are updated sucessfully";
		}return "phone number doesn't exist";
	}

	@Override
	public String deleteUser(String phoneNor) {
		if(repo.existsById(phoneNor)==true) {
			repo.deleteById(phoneNor);
			return "user is deleted";
		}return "phone number doesn't exist";
	}

}
