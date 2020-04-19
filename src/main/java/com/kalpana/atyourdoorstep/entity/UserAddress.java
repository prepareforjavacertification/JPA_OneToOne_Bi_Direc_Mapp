/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalpana.atyourdoorstep.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserAddress implements Serializable {
    
    
    @Column(name = "ADDRESS_TYPE")
    private String addressType;
    
    @Column(name = "ADDRESS_LINE_1")
    private String addressLine1;
    
    @Column(name = "ADDRESS_LINE_2")
    private String addressLine2;
    
    @Column(name = "STATE_NAME")
    private String stateName;
    
        @Column(name = "CITY")
    private String city;
    
    @Column(name = "COUNTRY")
    private String country;
    
    @Column(name = "ZIP")
    private int zip;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
        
    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

}
