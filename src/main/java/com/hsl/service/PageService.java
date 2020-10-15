package com.hsl.service;

import com.hsl.model.Department;
import com.hsl.model.Pager;
import com.hsl.model.Users;

public interface PageService {

    Pager<Department> findDepByPager(int page, int size);
    Pager<Users> findUsersByPager(int page, int size,int depid);
}
