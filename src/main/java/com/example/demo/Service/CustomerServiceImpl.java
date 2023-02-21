package com.example.demo.Service;

import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Repository.OrderRepository;
import com.example.demo.model.Customer;
import com.example.demo.model.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public int saveOrder(OrderDetails orderDetails) {
        orderRepository.save(orderDetails);
        return 1;
    }

    @Override
    public List<OrderDetails> findAll() {
        List<OrderDetails> list  = new ArrayList<>();
        try {
            list =  orderRepository.findAll();
        }catch (Exception ex){
            System.out.println("Exception : " + ex);
        }
        return list;
    }

    @Override
    public List<OrderDetails> getCustomerOrders(Long id) {
      List<OrderDetails> list  = new ArrayList<>();
        try {
            list =  orderRepository.findByCustomerId(id);
        }catch (Exception ex){
            System.out.println("Exception : " + ex);
        }
        return list;
    }



}
