package com.example.demo.dto;

public class StudentDTO {

    private String fName;
    private String lName;
    private String birthDate;

    public StudentDTO() {
    }

    public StudentDTO(String fName, String lName, String birthDate) {
        this.fName = fName;
        this.lName = lName;
        this.birthDate = birthDate;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
