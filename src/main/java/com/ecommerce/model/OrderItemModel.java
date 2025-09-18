package com.ecommerce.model;

import java.time.LocalDateTime;

public class OrderItemModel {
    private String id;
    private String orderId;
    private String productId;
    private String quantity;
    private String price;
    private LocalDateTime created;
    private LocalDateTime updated;

    public OrderItemModel() {
    }

    public OrderItemModel(String id, String orderId,
                          String price, String productId, String quantity,
                          LocalDateTime created, LocalDateTime updated) {

        this.id = id;
        this.orderId = orderId;
        this.price = price;
        this.productId = productId;
        this.quantity = quantity;
        this.created = created;
        this.updated = updated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
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
