package com.example.demo;

import Exceptions.Invalid;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class testBank {
    @Autowired
    private  Bank bank;

    @Test
    public void InsufficentCase(){
        assertThrows(Invalid.class,()->bank.Debit(122343523.00));
    }
    @Test
    public void successdebit(){
        assertEquals("Success",bank.Debit(1232.00));
    }
    @Test
    public void NegativeDebit(){
        assertThrows(Invalid.class,()->bank.Debit(-12442.00));
    }
    @Test
    public void Zerodebit(){

        System.out.println("hello");
    assertDoesNotThrow(()->bank.Debit(0.00));
    }


    @Test
    public void negativeCredit(){
        assertThrows(Invalid.class,()->bank.credit(-123.00));
    }
    @Test
    public void Success(){
        assertEquals("Success",bank.credit(123.0));
    }
    @Test
    public void Zerocredit(){
        assertDoesNotThrow(()->bank.credit(0.00));
    }

}