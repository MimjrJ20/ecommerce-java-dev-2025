package com.ecommerce.model;

import java.time.LocalDateTime;

public class CartModel {
    private String id;
    private String userId;
    private String status;
    private LocalDateTime created;
    private LocalDateTime updated;

    public CartModel() {
    }

    public CartModel( String id, String userId,
                      String status, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.userId = userId;
        this.status = status;
        this.created = created;
        this.updated = updated;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
