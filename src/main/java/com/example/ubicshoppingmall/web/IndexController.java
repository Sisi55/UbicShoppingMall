package com.example.ubicshoppingmall.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@RequiredArgsConstructor
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
