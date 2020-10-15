package com.hsl.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hsl.model.Department;
import com.hsl.model.Pager;
import com.hsl.model.Users;
import com.hsl.service.DepartmentService;
import com.hsl.service.PageService;
import com.hsl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pageService")
public class PageServiceImpl implements PageService {
    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private UserService userService;

    public Pager<Department> findDepByPager(int page, int size){

        Pager<Department> pager = new Pager<Department>();

        Page<Department> res = PageHelper.startPage(page,size);

        departmentService.showAllDep();

        pager.setRows(res.getResult());

        pager.setTotal(res.getTotal());

        pager.setPage(page);

        pager.setSize(size);
        return pager;

    }

    public Pager<Users> findUsersByPager(int page, int size,int depid){

        Pager<Users> pager = new Pager<Users>();

        Page<Users> res = PageHelper.startPage(page,size);

        userService.showAllUser(depid);

        pager.setRows(res.getResult());

        pager.setTotal(res.getTotal());

        pager.setPage(page);

        pager.setSize(size);
        return pager;

    }
}
