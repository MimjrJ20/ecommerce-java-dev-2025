package model;

import java.time.LocalDateTime;

public class UserModel {
    private String name;
    private String id;
    private String email;
    private String role;
    private String documentType;
    private String documentNumber;
    private LocalDateTime created;
    private LocalDateTime updated;

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
