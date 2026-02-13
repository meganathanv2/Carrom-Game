package com.mega.pack2;

import com.mega.pack1.payment;

public abstract  class basePayment implements payment{

    public void printmessage(){
        System.out.println("Starting the payment");
    }

}