package com.example.systemB.store;

import com.example.systemB.model.OutPayHeader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutPayHeaderRepository extends CrudRepository<OutPayHeader, Long> {
}
