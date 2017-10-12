package com.example.java_learning_week3.controller;

import com.example.java_learning_week3.Model.GetRandomNumbersResponse;
import com.example.java_learning_week3.Services.Week3Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;

@RestController
public class Week3Controller {


    @Autowired
    private Week3Service week3Service;

    ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value = "/GetRandomNumbers", produces = "application/json")
    GetRandomNumbersResponse getRandomNumbers() throws Exception {
        long beginTime = System.currentTimeMillis();
        int[] randomNumbers = week3Service.getRandomNumbers();
        long endTime = System.currentTimeMillis();
        GetRandomNumbersResponse response = new GetRandomNumbersResponse();
        response.setBeginTime(beginTime);
        response.setEndTime(endTime);
        response.setRandomNumbersText(Arrays.toString(randomNumbers));
        response.setTimeInterval(endTime - beginTime);
        return response;
    }
}
