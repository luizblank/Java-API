package com.luizblank.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizblank.demo.model.CompanyModel;
import com.luizblank.demo.repository.CompanyRepository;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public CompanyModel save(CompanyModel companyModel) {
        return this.companyRepository.save(companyModel);
    }

    public List<CompanyModel> findAll() {
        return this.companyRepository.findAll();
    }

    public List<CompanyModel> findByUserID(String userID) {
        return this.companyRepository.findByUserID(userID);
    }

    public List<CompanyModel> findByName(String name) {
        return this.companyRepository.findByName(name);
    }

    public void delete(String id) {
        this.companyRepository.deleteById(id);
    }
}
