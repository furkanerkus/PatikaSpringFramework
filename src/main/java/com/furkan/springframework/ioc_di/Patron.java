package com.furkan.springframework.ioc_di;

public class Patron implements PatronInterface {


    @Override
    public String surum(String data) {
        return "Sürüm " + data;
    }
}
