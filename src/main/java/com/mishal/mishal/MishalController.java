package com.mishal.mishal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MishalController {

    @GetMapping("/mishal")
    public String mishal(@RequestParam String number) {
        return "mishal" + number;
    }

} 
