package com.hsl.service;

import com.hsl.model.Department;
import com.hsl.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    int addUser(Users user) ;
    int deleteAllUser();
    List<Users> showAllUser(int depid);
}
