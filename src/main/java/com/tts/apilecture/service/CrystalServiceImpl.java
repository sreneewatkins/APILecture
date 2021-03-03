package com.tts.apilecture.service;

import com.tts.apilecture.model.Crystal;
import com.tts.apilecture.repos.CrystalRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CrystalServiceImpl implements CrystalService {

    CrystalRepository crystalRepository;

    public CrystalServiceImpl (CrystalRepository crystalRepository) {
        this.crystalRepository = crystalRepository;
    }

    @Override
    public Optional<Crystal> getCrystal(Long id) {
        return crystalRepository.findById(id);
    }

    @Override
    public Iterable<Crystal> getAllCrystals() {
        return crystalRepository.findAll();
    }

}//end CrystalServiceImpl class
