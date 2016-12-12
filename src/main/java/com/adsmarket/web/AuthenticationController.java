package com.adsmarket.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adsmarket.service.AuthenticationServiceImpl;

/**
 * REST 
 * @author Ha Quang Anh
 *
 */
@RestController
public class AuthenticationController {
	
	@Autowired
	AuthenticationServiceImpl authenticationService;
	
	/**
	 * Authenticate with input user id and password
	 * @param userid
	 * @param password
	 * @return true or false
	 */
	@RequestMapping(value = "/authenticate")
	@CrossOrigin
	public boolean authenticate(@RequestParam(required = false) String userid, 
									@RequestParam(required = false) String password) {
		return authenticationService.authenticate(userid, password);
	}
	

}
