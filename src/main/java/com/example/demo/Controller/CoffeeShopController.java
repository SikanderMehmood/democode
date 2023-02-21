package com.example.demo.Controller;


import com.example.demo.Service.CoffeeShopService;
import com.example.demo.model.CoffeeShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/coffeeshop")
public class CoffeeShopController {

    @Autowired
    private CoffeeShopService coffeeShopService;


    @PostMapping(value = "/registerNewCoffeeShop")
    public int registerCoffeeShop(){
        CoffeeShop coffeeShop = new CoffeeShop(1L,"CoffeeShop1","Commercial area Islamabad","+123123123123",10,"asdasd",new Date(),new Date());
        coffeeShopService.save(coffeeShop);
       return 1;
    }


    @GetMapping(value = "/find")
    public int getAllCustomersWaitingCount(@RequestParam String coffeeShopName){
        coffeeShopService.getAllCountOfCustomers();
        return 1;
    }


}
