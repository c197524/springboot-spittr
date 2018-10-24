package com.liuyisi.springbootspitter.web;


import com.liuyisi.springbootspitter.entity.Spitter;
import com.liuyisi.springbootspitter.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

}
