package com.example.demo.Service;

import com.example.demo.model.OperationModel;
import com.example.demo.model.Resonse;
import com.example.demo.model.TransferModel;

public interface BankOperationService {
    public Resonse performOperation(OperationModel operationModel);

    Resonse transfer(TransferModel transferModel);
}
