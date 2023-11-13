package com.example.demo.Repository;

import com.example.demo.model.BankAccount;
import com.example.demo.model.OperationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<BankAccount,Long> {

    BankAccount findByAccountNumber(String accountNumber);
}
