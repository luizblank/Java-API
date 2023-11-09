package com.luizblank.demo.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizblank.demo.dto.CompanyUserDTO;
import com.luizblank.demo.model.CompanyModel;
import com.luizblank.demo.model.UserModel;
import com.luizblank.demo.service.CompanyService;
import com.luizblank.demo.service.UserService;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private UserService userService;
    @Autowired
    private CompanyService companyService;

    @PostMapping("")
    public void newUser(@RequestBody CompanyUserDTO newCompanyUserDTO) {
        CompanyModel newCompanyModel = new CompanyModel(newCompanyUserDTO.getCompany().getName());

        UserModel userResp = userService.save(new UserModel(newCompanyUserDTO.getUser().getName(), newCompanyUserDTO.getUser().getAge()));
        newCompanyModel.setIdUser(new UserModel(userResp.getId()));
        companyService.save(newCompanyModel);
    }

    @PostMapping("/array")
    public void newUserArray(@RequestBody CompanyUserDTO newCompanyUserDTO) {
        List<UserModel> idsUsers = new ArrayList<UserModel>();

        for (UserModel test : newCompanyUserDTO.getUserList()) {
            UserModel userResp = userService.save(new UserModel(test.getName(), test.getAge()));
            idsUsers.add(new UserModel(userResp.getId()));
        }

        CompanyModel newCompanyModel = new CompanyModel(newCompanyUserDTO.getCompany().getName());

        newCompanyModel.setListUser(idsUsers);
        companyService.save(newCompanyModel);
    }

    @GetMapping("")
    public List<CompanyModel> findAllCompanyModels() {
        return companyService.findAll();
    }

    @GetMapping("/{name}")
    public List<CompanyModel> getCompanyByName(@PathVariable String name) {
        List<CompanyModel> listRes = companyService.findByName(name);
        return listRes;
    }

    @GetMapping("/user/{userId}")
    public List<CompanyModel> findByUserID(@PathVariable String userId) {
        return companyService.findByUserID(userId);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCompany(@PathVariable String id) {
        companyService.delete(id);
    }
}
