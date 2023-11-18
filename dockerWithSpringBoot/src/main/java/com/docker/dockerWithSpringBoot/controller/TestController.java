package com.docker.dockerWithSpringBoot.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("testing")
public class TestController {

    @GetMapping
    public ResponseEntity getValues() {


        HashMap<String, String> map = new HashMap<>();
        map.put("test1", "this is 1");
        map.put("test2", "this is 2");
        map.put("test3", "this is 3");
        map.put("test4", "this is 4");


        return ResponseEntity.ok(map);
    }
}
