package com.furkan.springframework.ioc_di;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "iocDiCalisan")
@ApplicationScoped
public class Calisan {

    @Inject
    private PatronInterface patronInterface;

    public Calisan() {
       //patronInterface = new Patron(); ==> Injection kullanıldığı için newlemeye gerek kalmıyor.
    }

    public String getData(String data) {
        return patronInterface.surum(data);
    }
}
