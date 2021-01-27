package com.example.ehcache1.controller;

import com.example.ehcache1.service.UserService;
import com.example.ehcache1.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.ehcache1.util.JsonResult.jsonResultSuccess;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    JsonResult test(@PathVariable int id) {
        return jsonResultSuccess("SUCCESS", userService.findById(id));
    }

    @GetMapping("save/{id}")
    JsonResult edit(@PathVariable int id) {
        return jsonResultSuccess("SUCCESS", userService.save(id));
    }

    @GetMapping("update/{id}")
    JsonResult update(@PathVariable int id) {
        return jsonResultSuccess("SUCCESS", userService.update(id));
    }

}
