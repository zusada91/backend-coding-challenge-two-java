package com.zipcode.apizip.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.annotation.ResponseStatusExceptionResolver;

import com.apicode.apizip.model.ZipCode;
import com.zipcode.apizip.dal.ZipCodeRepository;
/*import com.nigmacode.apirest.entity.User; 
import com.nigmacode.apirest.service.UserService;*/

//Indiciamos que es un controlador rest
@RestController
@RequestMapping("/zip_codes") //esta sera la raiz de la url, es decir http://127.0.0.1:8080/api/
public class ZipCodeController {

	private final ZipCodeRepository zipCodeRepository;
	
	public ZipCodeController(ZipCodeRepository zipCodeRepository) {
		this.zipCodeRepository = zipCodeRepository;
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<ZipCode> getAllZipCode() {
		return zipCodeRepository.findAll();
	}

	
	@RequestMapping(value = "/{zip_code}", method = RequestMethod.GET)
	public ZipCode getZipCode(@PathVariable String zip_code) {

		ZipCode zipCode = zipCodeRepository.findOne(zip_code);
		return zipCodeRepository.findOne(zip_code);		
	}
		
		

}
