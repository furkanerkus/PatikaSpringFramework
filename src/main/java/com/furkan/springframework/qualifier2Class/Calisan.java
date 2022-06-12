package com.furkan.springframework.qualifier2Class;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Calisan {

    //@Inject
    //private PatronInterface patronInterface;

    @Inject
    @QualifierMultiple
    private PatronInterface patronInterface;

    //public Calisan() {patronInterface = new Patron(); ==> Injection kullanıldığı için newlemeye gerek kalmıyor.}

    public String getData(String data) {
        return patronInterface.surum(data);
    }
}
