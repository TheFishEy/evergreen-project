package com.seedexchange.service;

import com.seedexchange.model.InventoryLog;
import com.seedexchange.model.SeedBox;
import com.seedexchange.repository.InventoryLogRepository;
import com.seedexchange.repository.SeedBoxRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SeedBoxService {

    private final SeedBoxRepository seedBoxRepository;
    private final InventoryLogRepository inventoryLogRepository;

    public SeedBoxService(SeedBoxRepository seedBoxRepository,
                          InventoryLogRepository inventoryLogRepository) {
        this.seedBoxRepository = seedBoxRepository;
        this.inventoryLogRepository = inventoryLogRepository;
    }

    public SeedBox getSeedBoxByLabel(String boxLabel) {
        return seedBoxRepository.findByBoxLabel(boxLabel)
                .orElseThrow(() -> new RuntimeException("Seed box not found: " + boxLabel));
    }


    // customer can
    // take one
    public SeedBox takeOnePackage(String boxLabel) {
        SeedBox seedBox = getSeedBoxByLabel(boxLabel);

        Integer currentCount = seedBox.getPackageCount();

        if (currentCount == null || currentCount <= 0) {
            throw new RuntimeException("Seed box is out of stock.");
        }

        Integer newCount = currentCount - 1;
        seedBox.setPackageCount(newCount);

        SeedBox updatedBox = seedBoxRepository.save(seedBox);

        InventoryLog log = new InventoryLog(
                "TAKE_ONE",
                currentCount,
                newCount,
                LocalDateTime.now(),
                updatedBox
        );

        inventoryLogRepository.save(log);

        return updatedBox;
    }

    // add one package

    public SeedBox addOnePackage(String boxLabel) {
        SeedBox seedBox = getSeedBoxByLabel(boxLabel);

        Integer currentCount = seedBox.getPackageCount();

        if (currentCount == null) {
            currentCount = 0;
        }

        Integer newCount = currentCount + 1;
        seedBox.setPackageCount(newCount);

        SeedBox updatedBox = seedBoxRepository.save(seedBox);

        InventoryLog log = new InventoryLog(
                "ADD_ONE",
                currentCount,
                newCount,
                LocalDateTime.now(),
                updatedBox
        );

        inventoryLogRepository.save(log);

        return updatedBox;
    }

    public java.util.List<SeedBox> getAllSeedBoxes() {
        return seedBoxRepository.findAllByOrderByRowNumberAscColumnNumberAsc();
    }
}