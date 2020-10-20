/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 *
 * @author msulbara
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    // no hace falta Autowired en constructor
    // tomara el primary bean del tipo GreetingService porque no se especifico otro
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
