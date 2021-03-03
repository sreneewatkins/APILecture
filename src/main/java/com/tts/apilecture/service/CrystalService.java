package com.tts.apilecture.service;

import com.tts.apilecture.model.Crystal;

import java.util.Optional;

public interface CrystalService {

    Optional<Crystal> getCrystal(Long id);
    Iterable<Crystal> getAllCrystals();

}//end CrystalService
