package com.hsl.controller;

import com.hsl.model.Department;
import com.hsl.model.Pager;
import com.hsl.model.Users;
import com.hsl.service.DepartmentService;
import com.hsl.service.PageService;
import com.hsl.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/hsl")
public class DepControl {

    @Autowired
    private UserService userService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private PageService pageService;

//    @RequestMapping("deleteDep")
//    public String delDepartment(){
//        departmentService.deleteAllDepartment();
//        return "login";
//    }
//    @RequestMapping("deleteUser")
//    public String delUser(){
//        userService.deleteAllUser();
//        return "index";
//    }
//    @RequestMapping("index")
//    public ModelAndView showAll() {
//        // 获取业务的查询结果
//        List<Department> list = departmentService.showAllDep();
//
//        System.out.println("deps"+list);
//        // 将查询的结果集合显示到pages/showUsers.jsp
//        ModelAndView m = new ModelAndView();
//        // 存储list
//        m.addObject("deps", list);
//        m.setViewName("index");
//        return m;
//    }

    @RequestMapping("deps")
    public ModelAndView showAllDeps() {
        // 获取业务的查询结果
        Pager pager=pageService.findDepByPager(1,50);
//        System.out.println(pager.getRows());
        // 将查询的结果集合显示到pages/showUsers.jsp
        ModelAndView m = new ModelAndView();
        // 存储list
        m.addObject("deps", pager);
        m.setViewName("deps");
        return m;
    }

    @RequestMapping("changepage")
    public ModelAndView changePage(@RequestParam(value = "page") String page) {
        // 获取业务的查询结果

        Pager pager=pageService.findDepByPager(Integer.parseInt(page),50);
        // 将查询的结果集合显示到pages/showUsers.jsp
        ModelAndView m = new ModelAndView();
        // 存储list
        m.addObject("deps", pager);
        m.setViewName("deps");
        return m;
    }

    @RequestMapping("alert")
    @ResponseBody
    public int alertDep(@RequestBody Department dep) {
        System.out.println(dep.getDepid()+dep.getDepname());
        Department department=departmentService.selectDepById(dep.getDepid());
        if(department!=null){
            return 0;
        }else {
            departmentService.alertDep(dep);
            return  1;
        }

    }

    @RequestMapping("test")
    public int alerttest() {
        Department department=new Department();
        department.setDepid(1);
        department.setDepname("depchange");
        departmentService.alertDep(department);
        return 1;
    }





}
