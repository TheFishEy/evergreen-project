package com.seedexchange.repository;

import com.seedexchange.model.SeedType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeedTypeRepository extends JpaRepository<SeedType, Long> {
}