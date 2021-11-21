package com.example.getapidataspringandshowtosuite.controller;

import com.example.getapidataspringandshowtosuite.entity.AllCourses;
import com.example.getapidataspringandshowtosuite.processor.UrlRequests;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/")
@Controller
public class ViewController {

    @GetMapping("/getAllCourse")
    public String getData(Model model) throws JsonProcessingException {
        UrlRequests urlRequests = new UrlRequests();
        String s = urlRequests.get("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json", AllCourses[].class);
        List<AllCourses> convert = urlRequests.convert(s);

        model.addAttribute("listCourses", convert);
        return "index";
    }
}
