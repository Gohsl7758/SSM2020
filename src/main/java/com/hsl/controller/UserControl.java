package com.hsl.controller;

import com.hsl.model.Pager;
import com.hsl.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hsl")
public class UserControl {
    @Autowired
    private PageService pageService;

    @RequestMapping("users")
    public ModelAndView showUsers(@RequestParam(value = "depid") String depid){
        System.out.println("depid"+depid);
        Pager pager=pageService.findUsersByPager(1,50,Integer.parseInt(depid));
        ModelAndView m = new ModelAndView();
        // 存储list
        m.addObject("users", pager) ;
        m.setViewName("users");
        return m;
    }
}
