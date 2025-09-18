package com.ecommerce.model;

import java.time.LocalDateTime;

public class ProductModel {
    private String id;
    private String name;
    private String description;
    private String price;
    private String categoryId;
    private String supplierId;
    private String stockQuantity;
    private String stockEntryDate;
    private LocalDateTime created;
    private LocalDateTime updated;

    public ProductModel() {
    }

    public ProductModel(String id, String name,
                        String categoryId, String description,
                        String price, String stockEntryDate,
                        String stockQuantity, String supplierId,
                        LocalDateTime created, LocalDateTime updated) {

        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.description = description;
        this.price = price;
        this.stockEntryDate = stockEntryDate;
        this.stockQuantity = stockQuantity;
        this.supplierId = supplierId;
        this.created = created;
        this.updated = updated;
    }







    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStockEntryDate() {
        return stockEntryDate;
    }

    public void setStockEntryDate(String stockEntryDate) {
        this.stockEntryDate = stockEntryDate;
    }

    public String getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(String stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
