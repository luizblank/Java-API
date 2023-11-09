package com.luizblank.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.luizblank.demo.model.CompanyModel;
import java.util.List;

public interface CompanyRepository extends MongoRepository<CompanyModel, String>{
    @Query("{'idUser.id': ?0 }")
    List<CompanyModel> findByUserID(String userId);
    
    @Query("{'name': ?0}")
    List<CompanyModel> findByName(String name);
}