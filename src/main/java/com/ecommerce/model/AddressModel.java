package com.ecommerce.model;

import java.time.LocalDateTime;

public class AddressModel {

    private String id;
    private String street;
    private String number;
    private String complement;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private LocalDateTime created;
    private LocalDateTime updated;

    public AddressModel() {
    }

    public AddressModel(String id, String city, String complement,
                        String country, String zipCode,
                        String number, String state, String street,
                        LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.city = city;
        this.complement = complement;
        this.country = country;
        this.zipCode = zipCode;
        this.number = number;
        this.state = state;
        this.street = street;
        this.created = created;
        this.updated = updated;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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
