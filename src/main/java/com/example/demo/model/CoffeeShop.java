package com.example.demo.model;


import jakarta.persistence.Entity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"phone"}))
public class CoffeeShop {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.SEQUENCE)
    @jakarta.persistence.Column(name = "id", nullable = false)
    private Long id;
    private String coffeeShopName;
    private String location;
    private String contact;
    private int queueSize;
    private String managerName;
    private Date  openingTime;
    private Date closingTime;

}
