package com.ecommerce.model;

import java.time.LocalDateTime;

public class PaymentModel {
    private String id;
    private String orderId;
    private String paymentMethod;
    private String status;
    private String amount;
    private String paymentDate;
    private LocalDateTime created;
    private LocalDateTime updated;

    public PaymentModel() {
    }

    public PaymentModel(String id, String amount,
                        String orderId, String paymentDate,
                        String paymentMethod, String status,
                        LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.amount = amount;
        this.orderId = orderId;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }



    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
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


