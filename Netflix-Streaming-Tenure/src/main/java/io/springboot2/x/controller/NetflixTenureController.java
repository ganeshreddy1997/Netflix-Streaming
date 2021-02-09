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

import io.springboot2.x.domain.NetflixTenure;
import io.springboot2.x.service.INetflixTenureService;

@RestController
public class NetflixTenureController {
@Autowired
private INetflixTenureService service;

@GetMapping("/tenure/{mobileNo}")
ResponseEntity<List<NetflixTenure>> findByMobileNo(@PathVariable String mobileNo){
	return new ResponseEntity<List<NetflixTenure>>(service.readByMobileNo(mobileNo),HttpStatus.OK);
	
}
@PostMapping("/tenure/add")
Boolean postTenure(@RequestBody NetflixTenure tenure) {
	return service.addTenure(tenure);
}
@PutMapping("/tenure/update")
Boolean updateTenure(@RequestBody NetflixTenure tenure) {
return service.updateTenure(tenure);

}
@DeleteMapping("/tenure/delete")
Boolean deleteById(@RequestParam Integer id) {
	return service.deleteById(id);
}
@GetMapping("/tenure/all")
ResponseEntity<List<NetflixTenure>> getAllTenures(){
	return new ResponseEntity<List<NetflixTenure>>(service.readAllTenures(),HttpStatus.OK);
}
}   
