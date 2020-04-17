package com.gf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gf
 * @title: TestController
 * @projectName boot-demo
 */
@RestController
public class TestController {

    @GetMapping(value = "/testBoot/{name}")
    public String test(@PathVariable String name) {
        return name;
    }

}
