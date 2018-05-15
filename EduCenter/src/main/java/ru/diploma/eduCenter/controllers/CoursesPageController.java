package ru.diploma.eduCenter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.diploma.eduCenter.forms.CourseForm;
import ru.diploma.eduCenter.services.CoursesPageService;

@Controller
public class CoursesPageController {

    @Autowired
    CoursesPageService coursesPageService;

    @GetMapping("/courses")
    public String getCoursesPage(ModelMap modelMap) {
        modelMap.addAttribute("courses", coursesPageService.getCourses());
        return "/courses";
    }

    @PostMapping("/courses")
    public String addCourse(CourseForm courseForm){
        coursesPageService.addCourse(courseForm);
        return "redirect:/courses";
    }
}
