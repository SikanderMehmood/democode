package com.example.demo.Service;

import com.example.demo.model.CoffeeShop;


public interface CoffeeShopService {
    public int  getAllCountOfCustomers();

    void save(CoffeeShop coffeeShop);
}
