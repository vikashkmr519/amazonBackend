package com.example.usermetadata.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usermetadata.entity.UserMetaData;
import com.example.usermetadata.repositories.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	public UserMetaData saveUserMetaData(UserMetaData userData) {
		
		UserMetaData user =userRepo.save(userData);
		return user;
		
	}
	
	
	public UserMetaData getUserMetaData(String userId) throws Exception {
		Optional<UserMetaData> opt = userRepo.findUserMetaDataByUniqueId(userId);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new Exception("User Not Found");
		}
	}
}
