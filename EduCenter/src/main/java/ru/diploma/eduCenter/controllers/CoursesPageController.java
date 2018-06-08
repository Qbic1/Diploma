package ru.diploma.eduCenter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/courses/{course-title}")
    public String enrollCourse(@PathVariable("course-title") String courseTitle, ModelMap modelMap, Authentication authentication) {
        coursesPageService.enrollCourse(authentication, courseTitle);
        return "redirect:/courses";
    }

    @PostMapping("/courses")
    public String addCourse(CourseForm courseForm){
        coursesPageService.addCourse(courseForm);
        return "redirect:/courses";
    }


}
