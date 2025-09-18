package com.ecommerce.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user")
public class UserModel {

    @Id
    @Column(length = 255)
    private String id;

    @Column(length = 255)
    private String name;

    @Column(length = 255, unique = true)
    private String email;

    @Column(length = 255)
    private String role;

    @Column(name = "documentType", length = 40)
    private String documentType;

    @Column(name = "documentNumber", length = 40)
    private String documentNumber;

    @Column(length = 255)
    private String password;

    @Column(name = "addressId", length = 255)
    private String addressId;

    private LocalDateTime created;
    private LocalDateTime updated;

    public UserModel() {
    }

    public UserModel(String documentNumber, String documentType,
                     String email, String id,
                     String name, String role,
                     LocalDateTime created, LocalDateTime updated) {
        this.documentNumber = documentNumber;
        this.documentType = documentType;
        this.email = email;
        this.id = id;
        this.name = name;
        this.role = role;
        this.created = created;
        this.updated = updated;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
