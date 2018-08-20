package com.sayant.factuweb.entity;

import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="Freelance")
@Data
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
