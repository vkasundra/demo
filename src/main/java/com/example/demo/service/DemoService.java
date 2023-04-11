package com.example.demo.service;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.StudentDTO;
import com.example.demo.helper.DemoHelper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DemoService {

    public ResponseDTO updateStudent(StudentDTO studentDTO) {
        ResponseDTO responseDTO = new ResponseDTO();
        if (studentDTO != null) {
            if (studentDTO.getfName() != null && studentDTO.getlName() != null) {
                responseDTO.setFullName(studentDTO.getfName() + " " + studentDTO.getlName());
            }
            if (studentDTO.getBirthDate() != null) {
                LocalDate dob = DemoHelper.stringToDate(studentDTO.getBirthDate());
                if (dob != null) {
                    responseDTO.setAgeInYears(DemoHelper.calculateAge(dob));
                    responseDTO.setAgeInDays(DemoHelper.calculateDays(dob));
                }
            }
            return responseDTO;
        } else {
            return null;
        }
    }

}
