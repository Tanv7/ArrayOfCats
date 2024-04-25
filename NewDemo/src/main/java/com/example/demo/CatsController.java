package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


@Controller
public class CatsController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/processFile")
    public String processFile(@RequestParam String fileName) {
        // Здесь можно добавить логику обработки файла и вывода списка котиков
        return "result";
    }
}



