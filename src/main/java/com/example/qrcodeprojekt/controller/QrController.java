package com.example.qrcodeprojekt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class QrController{

    @GetMapping("/{id}")
    public String getId(@PathVariable int id){
        return "YOU HAVE SCANNED QR CODE WITH ID: "+ id;
    }
}