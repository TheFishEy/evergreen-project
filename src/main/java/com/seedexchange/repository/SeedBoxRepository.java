package com.seedexchange.repository;

import com.seedexchange.model.SeedBox;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SeedBoxRepository extends JpaRepository<SeedBox, Long> {

    Optional<SeedBox> findByBoxLabel(String boxLabel);

    List<SeedBox> findAllByOrderByRowNumberAscColumnNumberAsc();
}