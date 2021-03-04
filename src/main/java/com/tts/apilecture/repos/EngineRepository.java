package com.tts.apilecture.repos;

import com.tts.apilecture.model.Engine;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EngineRepository extends CrudRepository<Engine, Long> {

    /*
    JPA - java persistence api. It's an abstraction layer that facilitates persistence.
    This line is a query method
     */
//    //@Query("")
//    Optional<Engine> findEngineByCylinderAndHorsepower(Integer cylinder,
//                                                       Integer horsepower);
}
