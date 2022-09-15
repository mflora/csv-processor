package com.example.systemB.service;

import org.springframework.beans.factory.annotation.Value;

public class CsvParser {

    @Value("${}")
    private String csvPath;
}
