package com.bit.web.controller;

import com.bit.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 */
@Controller
public class HomeController {
    @Autowired CustomerService customerService;
    @RequestMapping("/")
    public String index() {
        System.out.println("루트 URL 경로로 들어옴");
        int count = customerService.countAll();
        System.out.println("고객의 총인원 : " +count);
        return "index";
    }
}