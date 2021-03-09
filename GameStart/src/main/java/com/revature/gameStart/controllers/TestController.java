package com.revature.gameStart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.MediaType;
import java.util.*;

@RestController
@RequestMapping("/test")
public class TestController {

    //Constructors --------------------------------------------------
    @Autowired
    public TestController() {
    }

    //Get -----------------------------------------------------------
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String test(){
        return "deployment successful!";
    }

}
