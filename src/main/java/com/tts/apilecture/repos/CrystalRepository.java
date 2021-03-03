package com.tts.apilecture.repos;

import com.tts.apilecture.model.Crystal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrystalRepository extends CrudRepository<Crystal, Long> {
}
