package hellospring.demo.controllers;

import hellospring.demo.services.IsItFriday;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class HelloController {
    @GetMapping("/first-mapping")
    public String firstMapping(){
        return "Hello World";
    }

    @GetMapping("/second-mapping")
    public String secondMapping(){
        return "this is the second mapping";
    }

    @GetMapping("/")
    public String index(){
        return "Welcome brother, to the land of milk and honey";
    }

    @GetMapping("parameter")
    public String parameter(@RequestParam String param){
        //formatting
        //http://localhost:8080/parameter?param=INSERTSTRING
        return param + " is dumb.";
    }

    //lmao jeg er lazy
    @GetMapping("/ErDetFredag")
    public String erDetFredag(){
        String start = "<h1>Er det fredag? </h1>";
        boolean wellIsIt = IsItFriday.get();
        if (wellIsIt) {
            return start + "<h2>Ja.</h2>";
        }
        return start + "Nej.";
    }
}
