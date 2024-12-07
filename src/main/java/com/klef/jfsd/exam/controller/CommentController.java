package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CommentController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/comments")  // Ensure this matches the URL you're trying to access
    public String getComments() {
        String url = "https://jsonplaceholder.typicode.com/comments";
        return restTemplate.getForObject(url, String.class);
    }
}
