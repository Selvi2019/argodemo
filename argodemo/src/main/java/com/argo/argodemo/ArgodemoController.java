package com.argo.argodemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArgodemoController {
    @GetMapping("/hello")
    public String argodemo() {
        return "Hello World!!!";
    }
}
