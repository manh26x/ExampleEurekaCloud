package com.mike.cloudlearning.statistichistory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    // A REST method, To call from another service.
    // See in Lesson "Load Balancing with Ribbon".
    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {

        return "<html>Hello from Statistic-History</html>";
    }

}