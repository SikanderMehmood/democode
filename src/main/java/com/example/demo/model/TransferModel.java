package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransferModel {

    private String senderAccountNumber;
    private String reciverAccountNumber;
    private long amountToBeSent;


}
