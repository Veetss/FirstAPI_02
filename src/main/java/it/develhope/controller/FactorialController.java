package it.develhope.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial")
public class FactorialController {

    @GetMapping("/{n}")
    public long getFactorial(@PathVariable int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

// "long" è  un int che può contenere il doppio della lunghezza dell'int
