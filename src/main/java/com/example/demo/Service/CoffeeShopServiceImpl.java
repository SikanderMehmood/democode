package com.example.demo.Service;

import com.example.demo.Repository.CoffeeShopRepository;
import com.example.demo.model.CoffeeShop;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeShopServiceImpl implements CoffeeShopService{



    @Autowired
    private CoffeeShopRepository coffeeShopRepository;
    @Override
    public int getAllCountOfCustomers() {
        return 0;
    }

    @Override
    public void save(CoffeeShop coffeeShop) {
        try {
            coffeeShopRepository.save(coffeeShop);
        }catch (Exception ex){
            System.out.println("Exception : " + ex);
        }
    }
}
