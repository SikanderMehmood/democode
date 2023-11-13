package com.example.demo.Repository;

import com.example.demo.model.OperationModel;
import com.example.demo.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankingOpsRespository extends JpaRepository<OperationModel,Long> {

}
