package com.adsmarket.service;

/**
 * Authentication Service
 * @author Ha Quang Anh
 *
 */
public interface AuthenticationService {
	
	/**
	 * Authenticate
	 * @param userid
	 * @param password
	 * @return true or false
	 */
	public boolean authenticate(String userid, String password);

}
