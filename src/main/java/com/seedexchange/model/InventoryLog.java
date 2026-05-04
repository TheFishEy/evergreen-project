package com.seedexchange.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class InventoryLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String actionType;
    private Integer previousCount;
    private Integer newCount;
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "seed_box_id")
    private SeedBox seedBox;

    public InventoryLog() {
    }

    public InventoryLog(String actionType, Integer previousCount, Integer newCount,
                        LocalDateTime timestamp, SeedBox seedBox) {
        this.actionType = actionType;
        this.previousCount = previousCount;
        this.newCount = newCount;
        this.timestamp = timestamp;
        this.seedBox = seedBox;
    }

    public Long getId() {
        return id;
    }

    public String getActionType() {
        return actionType;
    }

    public Integer getPreviousCount() {
        return previousCount;
    }

    public Integer getNewCount() {
        return newCount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public SeedBox getSeedBox() {
        return seedBox;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public void setPreviousCount(Integer previousCount) {
        this.previousCount = previousCount;
    }

    public void setNewCount(Integer newCount) {
        this.newCount = newCount;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setSeedBox(SeedBox seedBox) {
        this.seedBox = seedBox;
    }
}