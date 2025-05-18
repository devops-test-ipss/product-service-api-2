package com.dev.product_service_api_2.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-service/api/v1/test")
public class TestController {

    @GetMapping
    public String test() {
        return "Hello from TestController";
    }

}
