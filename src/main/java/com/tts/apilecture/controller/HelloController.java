package com.tts.apilecture.controller;

import com.tts.apilecture.model.Engine;
import com.tts.apilecture.repos.EngineRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//@RequestMapping("/engine")
@RestController
public class HelloController {

//    private EngineRepository engineRepository;
//
//    public HelloController(EngineRepository engineRepository) {
//        this.engineRepository = engineRepository;
//    }
    public HelloController(){}

//    @GetMapping("/add")
//    public Engine addEngine(Engine engine) {
//        return engineRepository.save(engine);
//    }
//
//    @GetMapping("/all")
//    public Iterable<Engine> getAllEngines() {
//        return engineRepository.findAll();
//    }


    @GetMapping("/hello")
    public String getHello() {
        return "Hello world!";
    }

//    @GetMapping("/{id}/")
//    public Optional<Engine> getEngine(@PathVariable Long id) {
//        return engineRepository.findById(id);
//    }

    //dealerships/{dealershipId}/cars/{carId}

    @GetMapping("/helloo")
    public String personalGreeting(@RequestParam(defaultValue = "World") String name) {
        return "Hello " + name;
    }
    //in the url, type: /helloo?name=Renee

}//end HelloController class
