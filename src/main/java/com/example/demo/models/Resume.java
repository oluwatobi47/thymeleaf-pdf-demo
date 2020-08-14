package com.example.demo.models;

import lombok.Data;

import java.util.List;

/**
 * Created by Oluwatobi on 8/14/2020.
 */
@Data
public class Resume {
    private String name;
    private String phoneNumber;
    private String Address;
    private List<EducationalHistory> educationalHistoryList;
}
