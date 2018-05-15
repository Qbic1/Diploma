package ru.diploma.eduCenter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.diploma.eduCenter.forms.NewsForm;
import ru.diploma.eduCenter.services.NewsPageService;

@Controller
public class NewsPageController {

    @Autowired
    private NewsPageService service;

    @GetMapping("/news")
    public String getNewsPage(ModelMap modelMap) {
        modelMap.addAttribute("newsList", service.getNews());
        return "/news";
    }

    @PostMapping("/news")
    public String addNews(NewsForm newsForm){
        service.addNews(newsForm);
        return "redirect:/news";
    }
}
