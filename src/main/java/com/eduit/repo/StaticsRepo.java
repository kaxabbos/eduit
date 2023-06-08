package com.eduit.repo;

import com.eduit.model.Statics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticsRepo extends JpaRepository<Statics, Long> {

}
