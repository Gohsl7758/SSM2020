package com.hsl.impl;

import com.hsl.dao.UsersMapper;
import com.hsl.model.Department;
import com.hsl.model.Users;
import com.hsl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public int addUser(Users user) {

        usersMapper.insert(user);
        return 1;
    }

    @Override
    public int deleteAllUser() {
        usersMapper.deleteAllUser();
        return 1;
    }

    @Override
    public List<Users> showAllUser(int depid){
        return usersMapper.selectAllUsers(depid);

    }
}
