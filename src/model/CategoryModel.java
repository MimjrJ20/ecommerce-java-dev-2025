package model;

import java.time.LocalDateTime;

public class CategoryModel {
    private String id;
    private String name;
    private Long description;
    private LocalDateTime created;
    private LocalDateTime updated;

    public CategoryModel() {
    }

    public CategoryModel(Long description, String id, String name,
                         LocalDateTime created, LocalDateTime updated) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.created = created;
        this.updated = updated;
    }

    public Long getDescription() {
        return description;
    }

    public void setDescription(Long description) {
        this.description = description;
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
