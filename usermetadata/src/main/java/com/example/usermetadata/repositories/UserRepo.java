package com.example.usermetadata.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.usermetadata.entity.UserMetaData;

public interface UserRepo extends JpaRepository<UserMetaData, Long>{
	
	Optional<UserMetaData> findUserMetaDataByUniqueId(String uniqueId);

}
