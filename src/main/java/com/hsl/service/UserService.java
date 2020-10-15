package com.hsl.service;

import com.hsl.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;


public interface UserService {
    int addUser(Users user) ;
    int deleteAllUser();
}
