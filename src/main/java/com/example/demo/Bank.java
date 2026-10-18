package com.example.demo;

import Exceptions.Invalid;
import org.springframework.stereotype.Service;

@Service
public class Bank {
         public Double balance=12324.00;
         public String Debit(Double amount){
             if(amount==null){
                 throw new Invalid("Invalid data");
             }
             if(amount>balance){
                 throw new Invalid("Insufficient balance");
             }
             if(amount<0){
                 throw new Invalid("Only positive values accepted");
             }
             balance-=amount;
             return "Success";

    }
        public String credit(Double amount){
             if(amount==null){
                 throw new Invalid("Invalid data");
             }
             if(amount<0){
                 throw new Invalid("You cant add negative amount");
             }
             balance+=amount;
             return "Success";
    }

}