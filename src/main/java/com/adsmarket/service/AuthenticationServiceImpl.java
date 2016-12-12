package com.adsmarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adsmarket.domain.User;
import com.adsmarket.repository.UserRepository;

@Service
@Transactional
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean authenticate(String userid, String password) {
		User user = userRepository.findByUserIdIgnoringCase(userid);
		if (user != null && user.getPassword().equals(password) && "active".equals(user.getStatus())) {
			return true;
		}
		return false;
	}

}
