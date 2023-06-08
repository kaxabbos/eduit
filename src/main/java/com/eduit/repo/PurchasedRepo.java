package com.eduit.repo;

import com.eduit.model.Purchased;
import com.eduit.model.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchasedRepo extends JpaRepository<Purchased, Long> {
    List<Purchased> findAllByStatus(Status status);
}
