package com.furkan.springframework.qualifier4class;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier4Cdi")
@ApplicationScoped
public class Calisan {

    //Default çalışıyor
    //@Inject
    //private PatronInterface patronInterface;

    //İstediğim seçenek seçiyorum. --- First Alternative
    //@Inject
    //@QualifierMultiple2(EMultipleAlternative.FIRST)
    //private PatronInterface patronInterface;

    //İstediğim seçenek seçiyorum. --- Third Alternative
    @Inject
    @QualifierMultiple2(EMultipleAlternative.THIRD)
    private PatronInterface patronInterface;






    //public Calisan() {patronInterface = new Patron(); ==> Injection kullanıldığı için newlemeye gerek kalmıyor.}

    public String getData(String data) {
        return patronInterface.surum(data);
    }
}
