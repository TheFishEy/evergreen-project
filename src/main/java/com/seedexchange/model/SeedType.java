package com.seedexchange.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SeedType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String plantingDepth;
    private String sunlight;
    private String watering;
    private String spacing;
    private Integer daysToGerminate;
    private Integer daysToHarvest;

    public SeedType() {
    }

    public SeedType(String name, String description, String plantingDepth, String sunlight,
                    String watering, String spacing, Integer daysToGerminate, Integer daysToHarvest) {
        this.name = name;
        this.description = description;
        this.plantingDepth = plantingDepth;
        this.sunlight = sunlight;
        this.watering = watering;
        this.spacing = spacing;
        this.daysToGerminate = daysToGerminate;
        this.daysToHarvest = daysToHarvest;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPlantingDepth() {
        return plantingDepth;
    }

    public String getSunlight() {
        return sunlight;
    }

    public String getWatering() {
        return watering;
    }

    public String getSpacing() {
        return spacing;
    }

    public Integer getDaysToGerminate() {
        return daysToGerminate;
    }

    public Integer getDaysToHarvest() {
        return daysToHarvest;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPlantingDepth(String plantingDepth) {
        this.plantingDepth = plantingDepth;
    }

    public void setSunlight(String sunlight) {
        this.sunlight = sunlight;
    }

    public void setWatering(String watering) {
        this.watering = watering;
    }

    public void setSpacing(String spacing) {
        this.spacing = spacing;
    }

    public void setDaysToGerminate(Integer daysToGerminate) {
        this.daysToGerminate = daysToGerminate;
    }

    public void setDaysToHarvest(Integer daysToHarvest) {
        this.daysToHarvest = daysToHarvest;
    }
}