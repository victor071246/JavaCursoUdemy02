package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("calculadora")
public class CalculadoraController {

    // /calculadora/somar/10/20
    @GetMapping("somar/{a}/{b}")
    public int somar(@PathVariable int a, @PathVariable int b){
        return a + b;
    }


    // /calculadora/subtrair?a=100&b=39
    @GetMapping("subtrair")
    public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        return a - b;
    }

}

