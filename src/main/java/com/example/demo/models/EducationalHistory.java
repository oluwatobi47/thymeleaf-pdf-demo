package com.example.demo.models;

import lombok.Data;

import java.util.Date;

/**
 * Created by Oluwatobi on 8/14/2020.
 */
@Data

public class EducationalHistory {
    private String institution;
    private String institutionType;
    private String startYear;
    private String endYear;


    public EducationalHistory(String institution, String institutionType, String startYear, String endYear) {
        this.institution = institution;
        this.institutionType = institutionType;
        this.startYear = startYear;
        this.endYear = endYear;
    }
}
