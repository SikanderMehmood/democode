package com.example.demo.Controller;

import com.example.demo.Service.BankOperationService;
import com.example.demo.model.OperationModel;
import com.example.demo.model.Resonse;
import com.example.demo.model.TransferModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class BankingOpsController {

    @Autowired
    private BankOperationService bankOperationService;



    @PostMapping(value = "/operation")
    public Resonse performOperation(@RequestBody OperationModel operationModel){
       return bankOperationService.performOperation(operationModel);
    }
    @PostMapping(value = "/transferCash")
    public Resonse transferCash(@RequestBody TransferModel transferModel){
        return bankOperationService.transfer(transferModel);
    }

}
