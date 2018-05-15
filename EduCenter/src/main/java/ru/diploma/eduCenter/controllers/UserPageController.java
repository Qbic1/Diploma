package ru.diploma.eduCenter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.diploma.eduCenter.services.UserPageService;

@Controller
public class UserPageController {

    @Autowired
    UserPageService userPageService;

    @GetMapping("/")
    public String getUserPage(Authentication authentication, ModelMap modelMap) {
        if(authentication == null) {
            return "redirect:/login";
        }
        modelMap.addAttribute("client", userPageService.getUser(authentication));
        return "/profile";
    }
}
