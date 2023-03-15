package co.develhope.firstapi2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FactorialController {




    @GetMapping(value = "/factorial/{n}")
    public long factorial (@PathVariable int n){
        long fact= 1;
        for (int i =2; i <=n; i++){
            fact= fact *i;

        }
        return fact;
    }
}
