package com.luizblank.demo.dto;

import com.luizblank.demo.model.CompanyModel;
import com.luizblank.demo.model.UserModel;

import lombok.Data;
import java.util.List;

@Data
public class CompanyUserDTO {

    private UserModel user;
    private List<UserModel> userList;
    private CompanyModel company;
}
