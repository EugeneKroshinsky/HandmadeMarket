package com.bsu.HandmadeMarketplace.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class OrderController {
    @GetMapping("/hello")
    public String getMainPage() {
        return "index";
    }
}
