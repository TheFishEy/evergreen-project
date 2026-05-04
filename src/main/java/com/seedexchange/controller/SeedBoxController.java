package com.seedexchange.controller;

import com.seedexchange.model.SeedBox;
import com.seedexchange.service.SeedBoxService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/seed-boxes")
public class SeedBoxController {

    private final SeedBoxService seedBoxService;

    public SeedBoxController(SeedBoxService seedBoxService) {
        this.seedBoxService = seedBoxService;
    }

    @GetMapping("/{boxLabel}")
    public SeedBox getSeedBox(@PathVariable String boxLabel) {
        return seedBoxService.getSeedBoxByLabel(boxLabel);
    }

    // routing for backend -> route -> frontend

    // taking one package
    @PostMapping("/{boxLabel}/take-one")
    public SeedBox takeOne(@PathVariable String boxLabel) {
        return seedBoxService.takeOnePackage(boxLabel);
    }

    // addign one package
    @PostMapping("/{boxLabel}/add-one")
    public SeedBox addOne(@PathVariable String boxLabel) {
        return seedBoxService.addOnePackage(boxLabel);
    }

    @GetMapping
    public java.util.List<SeedBox> getAllSeedBoxes() {
        return seedBoxService.getAllSeedBoxes();
    }
}