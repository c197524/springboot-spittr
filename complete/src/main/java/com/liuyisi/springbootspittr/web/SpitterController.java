package com.liuyisi.springbootspittr.web;


import com.liuyisi.springbootspittr.entity.Spitter;
import com.liuyisi.springbootspittr.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

    @Autowired
    private SpitterService spitterService;


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegisterForm(Model model) {
        model.addAttribute(new Spitter());
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String pocessRegistration(@Valid Spitter spitter, BindingResult bindingResult) {
        if (bindingResult.hasErrors() || spitterService.findUserExistByUsername(spitter.getUsername())) {
            return "registerForm";
        }
        spitterService.save(spitter);
        return "redirect:" + spitter.getUsername();
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showSpitterProfile(
            @PathVariable String username, Model model) {
        model.addAttribute(spitterService.findByUsername(username));
        return "profile";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String showLoginPage(Model model) {
        model.addAttribute(new Spitter());
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Spitter spitter, HttpSession session,Model model) {
        if (!spitterService.validateLogin(spitter)) {
            model.addAttribute("valiError","用户名或密码错误");
            return "login";
        }
        session.setAttribute("spitter",spitter);
        return "redirect:/";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("spitter");
        return "redirect:/";
    }

}
