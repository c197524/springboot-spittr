package com.liuyisi.springbootspittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(HttpSession session) {
        return "home";
    }
}
