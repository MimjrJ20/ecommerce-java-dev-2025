package model;

import java.time.LocalDateTime;

public class SupplierModel {
    private String id;
    private String name;
    private String contactInfo;
    private String documentNumberSupplier;
    private LocalDateTime created;
    private LocalDateTime updated;

    public SupplierModel(String contactInfo, String documentNumberSupplier,
                         String id, String name,
                         LocalDateTime created, LocalDateTime updated) {
        this.contactInfo = contactInfo;
        this.documentNumberSupplier = documentNumberSupplier;
        this.id = id;
        this.name = name;
        this.created = created;
        this.updated = updated;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getDocumentNumberSupplier() {
        return documentNumberSupplier;
    }

    public void setDocumentNumberSupplier(String documentNumberSupplier) {
        this.documentNumberSupplier = documentNumberSupplier;
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

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
