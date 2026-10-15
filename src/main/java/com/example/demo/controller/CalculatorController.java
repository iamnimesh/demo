package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CalculatorService;

import lombok.AllArgsConstructor;

@AllArgsConstructor 
@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {
    
    private final CalculatorService calculatorService;

    @GetMapping ("/add")
    public int add(
        @RequestParam  int a,
        @RequestParam int b) {
            return calculatorService.add(a, b);            
    }
}
