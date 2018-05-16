package ru.diploma.eduCenter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.diploma.eduCenter.forms.UserForm;
import ru.diploma.eduCenter.services.SignUpService;

import javax.validation.Valid;

@Controller
public class SignUpController {
    @Autowired
    private SignUpService service;

    @GetMapping("/signUp")
    public String getSignUpPage(Authentication authentication, Model model) {
        if (authentication != null) {
            return "redirect:/";
        }
        model.addAttribute("userForm", new UserForm());
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(@Valid UserForm userForm, BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
            service.signUp(userForm);
            return "redirect:/login";
        }
        model.addAttribute("userForm", userForm);
        return "signUp";
    }
}
