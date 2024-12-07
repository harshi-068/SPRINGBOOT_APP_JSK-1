package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String URL = "https://jsonplaceholder.typicode.com/comments";

    public List<Comment> getAllComments() {
        Comment[] comments = restTemplate.getForObject(URL, Comment[].class);
        return Arrays.asList(comments);
    }
}
