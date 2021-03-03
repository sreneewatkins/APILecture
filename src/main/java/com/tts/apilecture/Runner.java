package com.tts.apilecture;

import com.tts.apilecture.model.Crystal;
import com.tts.apilecture.repos.CrystalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//this loads the database
@Component
public class Runner implements CommandLineRunner {

    @Autowired
    CrystalRepository crystalRepository;

    @Override
    public void run(String... args) throws Exception {

        crystalRepository.save(new Crystal("clear", "clear quartz"));
        crystalRepository.save(new Crystal("purple", "amethyst"));
        crystalRepository.save(new Crystal("yellow", "citrine"));

    }
}