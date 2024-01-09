package com.news.news.controllers;

import com.news.news.models.User;
import com.news.news.services.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServcie userServcie;

    @GetMapping("sign-up")
    public String signup(Model model){
        model.addAttribute("user", new User());
        return "inscription";
    }

    @PostMapping("sign-up")
    public String signUp(@ModelAttribute User user){
        userServcie.saveMyDocument(user);
        return "redirect:/user/sign-up";
    }
}
