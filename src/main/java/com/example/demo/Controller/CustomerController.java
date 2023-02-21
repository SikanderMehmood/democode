package com.example.demo.Controller;


import com.example.demo.Service.CustomerService;
import com.example.demo.model.Customer;
import com.example.demo.model.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/register")
    public Customer registerCustomer() {
        Customer customer = new Customer(1L,"Sikander","Bahawalpur","123123123123");
        return customerService.save(customer);
    }

    @PostMapping(value = "/order")
    public int registerOrder(){
        OrderDetails orderDetails1 = new OrderDetails(1L,1L,"asdas","asdas");
        return customerService.saveOrder(orderDetails1);
    }

    @GetMapping(value = "/getAllOrders")
    public List<OrderDetails>  getAllOrders(){
        return customerService.findAll();
    }

    @GetMapping(value = "/findCustomerOrders")
    public List<OrderDetails> getSpecificOrders(@RequestParam(value = "id") Long id){
        return customerService.getCustomerOrders(id);
    }


}
