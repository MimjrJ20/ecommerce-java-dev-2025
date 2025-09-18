package com.ecommerce.model;

import java.time.LocalDateTime;

public class OrdersModel {

    private String id;
    private String customerId;
    private String totalAmount;
    private String status;
    private String shippingAddressId;
    private LocalDateTime created;
    private LocalDateTime updated;

    public OrdersModel() {
    }

    public OrdersModel(String id, String customerId,
                       String shippingAddressId, String status,
                       String totalAmount,
                       LocalDateTime created, LocalDateTime updated) {

        this.id = id;
        this.customerId = customerId;
        this.shippingAddressId = shippingAddressId;
        this.status = status;
        this.totalAmount = totalAmount;
        this.created = created;
        this.updated = updated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    public String getShippingAddressId() {
        return shippingAddressId;
    }

    public void setShippingAddressId(String shippingAddressId) {
        this.shippingAddressId = shippingAddressId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
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
