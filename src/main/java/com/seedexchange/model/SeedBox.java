package com.seedexchange.model;

import jakarta.persistence.*;

@Entity
public class SeedBox {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String boxLabel;
    private Integer rowNumber;
    private Integer columnNumber;
    private Integer packageCount;
    private String notes;

    @ManyToOne
    @JoinColumn(name = "seed_type_id")
    private SeedType seedType;

    public SeedBox() {
    }

    public SeedBox(String boxLabel, Integer rowNumber, Integer columnNumber,
                   Integer packageCount, String notes, SeedType seedType) {
        this.boxLabel = boxLabel;
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.packageCount = packageCount;
        this.notes = notes;
        this.seedType = seedType;
    }

    public Long getId() {
        return id;
    }

    public String getBoxLabel() {
        return boxLabel;
    }

    public Integer getRowNumber() {
        return rowNumber;
    }

    public Integer getColumnNumber() {
        return columnNumber;
    }

    public Integer getPackageCount() {
        return packageCount;
    }

    public String getNotes() {
        return notes;
    }

    public SeedType getSeedType() {
        return seedType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBoxLabel(String boxLabel) {
        this.boxLabel = boxLabel;
    }

    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    public void setColumnNumber(Integer columnNumber) {
        this.columnNumber = columnNumber;
    }

    public void setPackageCount(Integer packageCount) {
        this.packageCount = packageCount;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setSeedType(SeedType seedType) {
        this.seedType = seedType;
    }
}