package com.adsmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adsmarket.domain.User;
import java.lang.String;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUserIdIgnoringCase(String userId);
}
