package io.springboot2.x.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springboot2.x.domain.NetflixTenure;
import io.springboot2.x.repository.NetflixTenureRepository;
import io.springboot2.x.service.INetflixTenureService;
@Service
public class NetflixTenureServiceImpl implements INetflixTenureService {
    @Autowired
    private NetflixTenureRepository repo;
    
	@Override
	public List<NetflixTenure> readByMobileNo(String mobileNo) {
		
		return repo.findByMobileNo(mobileNo);
	}

	@Override
	public Boolean addTenure(NetflixTenure tenure) {
		// TODO Auto-generated method stub
		if(repo.existsById(tenure.getId())==false)
		{
			repo.save(tenure);
		return true;
		}
		
		return false;
	}

	@Override
	public Boolean updateTenure(NetflixTenure tenure) {
		// TODO Auto-generated method stub
		if(repo.existsById(tenure.getId())==true)
		{
			repo.saveAndFlush(tenure);
			return true;
		}
		return false;
	}

	@Override
	public Boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		if(repo.existsById(id)==true) {
			repo.deleteById(id);
			return true;
			
		}
		return false;
	}

	@Override
	public List<NetflixTenure> readAllTenures() {
		
		return repo.findAll();
	}

}
