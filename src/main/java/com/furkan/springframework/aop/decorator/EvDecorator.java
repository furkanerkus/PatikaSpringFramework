package com.furkan.springframework.aop.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
abstract public class EvDecorator implements IEv {


    private @Inject @Delegate IEv iEv;
    @Override
    public String boyama(String data) {
        System.out.println("Decorator Buradaydı !!!");
        String dataInformation = iEv.boyama(data);
        if(dataInformation.equals("boyuyoruz")) {
            dataInformation =dataInformation.toUpperCase();
        }
        return dataInformation;
    }
}
