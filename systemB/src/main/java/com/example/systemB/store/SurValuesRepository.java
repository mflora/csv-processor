package com.example.systemB.store;

import com.example.systemB.model.SurValues;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurValuesRepository extends CrudRepository<SurValues, Long> {
}
