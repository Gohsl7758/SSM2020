package com.hsl.controller;

import com.hsl.model.Department;
import com.hsl.model.Users;
import com.hsl.service.DepartmentService;
import com.hsl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hsl")
public class TestControl {

    @Autowired
    private UserService userService;
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("deleteDep")
    public String delDepartment(){
        departmentService.deleteAllDepartment();
        return "login";
    }
    @RequestMapping("deleteUser")
    public String delUser(){

        return "index";
    }

//    @RequestMapping("/test")
//    public String test(){
//        System.out.println("test");
//        Users user=new Users();
//        user.setUid(1);
//        user.setUsername("user1");
//        user.setDepid(1);
//        Department department=new Department();
//        department.setDepid(1);
//        department.setDepname("dep1");
//        departmentService.addDepartment(department);
//        userService.addUser(user);
//        return "test";
//    }




}
