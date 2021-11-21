package com.example.getapidataspringandshowtosuite.processor;

import com.example.getapidataspringandshowtosuite.entity.AllCourses;
import com.example.getapidataspringandshowtosuite.entity.Ent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UrlRequests {


    public static void main(String[] args) {
        UrlRequests allCoursesUrlRequests = new UrlRequests();
        System.out.println("Enter value:");
        while (!(new Scanner(System.in).nextLine()).equals("q")) {
            allCoursesUrlRequests.get("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json", AllCourses[].class);
        }
    }

    public String get(String urlAddr, Class<AllCourses[]> obj) {
        String request = "";
        try {
            URL url = new URL(urlAddr);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            try (BufferedReader inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                String line;
                StringBuilder buffer = new StringBuilder();
                while ((line = inputStream.readLine()) != null) {
                    buffer.append(line);
                }
                request = buffer.toString();
            }

            ObjectMapper objectMapper = new ObjectMapper();
            Ent[] currentCourses = objectMapper.readValue(request, obj);

            for (Ent currentCours : currentCourses) {
                System.out.println(currentCours.toString());
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("Something wrong");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Wrong");
        }
        return request;

    }

    public List<AllCourses> convert(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        AllCourses[] currentCourses = objectMapper.readValue(json, AllCourses[].class);
        return Arrays.stream(currentCourses).collect(Collectors.toList());
    }
}
