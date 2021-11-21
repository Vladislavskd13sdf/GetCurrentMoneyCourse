package com.example.getapidataspringandshowtosuite.controller;

import com.example.getapidataspringandshowtosuite.entity.AllCourses;
import com.example.getapidataspringandshowtosuite.processor.UrlRequests;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@CrossOrigin
@RestController
public class DataController {

    @GetMapping("getCourse")
    public String getData() {
        UrlRequests urlRequests = new UrlRequests();
        return urlRequests.get("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json", AllCourses[].class);
    }
}
