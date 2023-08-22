package com.control.exception.controller;

import com.control.exception.model.dto.ErrorResponseDto;
import com.control.exception.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class ControllerLayer {

    private final ServiceLayer serviceLayer;

    @Autowired
    public ControllerLayer(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }

    @GetMapping("/example")
    public ResponseEntity<Object> exampleControllerMethod() throws Exception {
        serviceLayer.exampleServiceMethod();
        return ResponseEntity.ok("Success!");
    }
}