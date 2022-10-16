package com.example.cloudgateaway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//ce controller ne fonctionne pas
@RestController
public class FallBackMethodController {
    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User Service is Taking longer then Expected. " + "Please try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod() {
        return "Department Service is Taking longer then Expected. " + "Please try again later";
    }
}
