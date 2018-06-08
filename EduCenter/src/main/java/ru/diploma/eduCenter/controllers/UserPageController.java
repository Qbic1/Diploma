package ru.diploma.eduCenter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.diploma.eduCenter.services.UserPageService;

@Controller
public class UserPageController {

    @Autowired
    UserPageService userPageService;

    @GetMapping("/")
    public String getUserPage(Authentication authentication, ModelMap modelMap) {
        if (authentication == null) {
            return "redirect:/login";
        }
        modelMap.addAttribute("client", userPageService.getUser(authentication));
        return "/profile";
    }

    @GetMapping("/delete")
    public String deleteProfile(Authentication authentication) {
        userPageService.delete(authentication);
        return "redirect:/logout";
    }

    @GetMapping("/mycourses")
    public String myCourses(Authentication authentication, ModelMap modelMap) {
        modelMap.addAttribute("courses", userPageService.getMyCourses(authentication));
        return "/mycourses";
    }
}
