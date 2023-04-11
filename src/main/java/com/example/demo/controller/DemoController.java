package com.example.demo.controller;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.StudentDTO;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class DemoController {
    @Autowired
    private DemoService service;

    @PostMapping("/")
    public ResponseDTO getStudent(@RequestBody StudentDTO studentDTO) {
        ResponseDTO responseDTO = service.updateStudent(studentDTO);
        if (responseDTO != null) {
            return responseDTO;
        } else {
            return null;
        }

    }

}
