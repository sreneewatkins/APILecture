package com.tts.apilecture.controller;

import com.tts.apilecture.model.Engine;
import com.tts.apilecture.repos.EngineRepository;
import com.tts.apilecture.repos.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/engine")
@RestController
public class EngineController {

    private EngineRepository engineRepository;

    public EngineController(EngineRepository engineRepository) { this.engineRepository = engineRepository; }

    @GetMapping("/add")
    public Engine addEngine(Engine engine) {
        return engineRepository.save(engine);
    }

    @GetMapping("/all")
    public Iterable<Engine> getAllEngines() {
        return engineRepository.findAll();
    }

    @GetMapping("/{id}/")
    public Optional<Engine> getEngine(@PathVariable Long id) {
        return engineRepository.findById(id);
    }

    //dealerships/{dealershipId}/cars/{carId}


}//end EngineController class
