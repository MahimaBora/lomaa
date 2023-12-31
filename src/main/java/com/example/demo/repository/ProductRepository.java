package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserInfo;

@Repository
public interface ProductRepository extends MongoRepository<UserInfo, String> {
    
	
	@Query("{mailID : ?0}")
	List<UserInfo> findByMailID(String mailID);
   
}
