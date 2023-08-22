package com.control.exception.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {

    public void exampleServiceMethod() throws Exception {
        throw new Exception("An error occurred in the service layer.");
    }
}