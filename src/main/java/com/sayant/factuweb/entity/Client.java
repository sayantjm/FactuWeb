package com.sayant.factuweb.entity;

import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="Client")
@Data
public class Client {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String CIF;

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

    protected Client() {

    }

    public Client(String name, String CIF, String address, int codPostal, String city, String state, String phone, String mobile) {
        this.name = name;
        this.CIF = CIF;
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
                ", CIF='" + CIF + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
