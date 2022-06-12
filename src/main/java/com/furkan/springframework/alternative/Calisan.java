package com.furkan.springframework.alternative;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeDi")
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
