package com.example.demo.Service;

import com.example.demo.model.Customer;
import com.example.demo.model.OrderDetails;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerService {
    Customer save(Customer customer);

    int saveOrder(OrderDetails orderDetails);

    List<OrderDetails> findAll();

    List<OrderDetails> getCustomerOrders(Long id);
}
