package com.sayant.factuweb.entity;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="Freelance")
public class Freelance {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String DNI;

    private String address;
    private int codPostal;
    private String city;
    private String state;
    private String phone;
    private String mobile;

    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;

    @CreatedDate
    private LocalDateTime createdDate;

    protected Freelance() {

    }

    public Freelance(String name, String DNI, String address, int codPostal, String city, String state, String phone, String mobile) {
        this.name = name;
        this.DNI = DNI;
        this.address = address;
        this.codPostal = codPostal;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String CIF) {
        this.DNI = DNI;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DNI='" + DNI + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
