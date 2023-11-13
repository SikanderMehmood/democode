package com.example.demo.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"accountNumber"}))
public class BankAccount {

    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.SEQUENCE)
    @jakarta.persistence.Column(name = "id", nullable = false)
    private Long id;

    private String accountNumber;
    private String accountHolderName;
    private long currentBalance;
    private String accountType;
}
