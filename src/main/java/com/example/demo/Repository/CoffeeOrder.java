package com.example.demo.Repository;

import com.example.demo.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeOrder extends JpaRepository<OrderDetails,Long> {

}
