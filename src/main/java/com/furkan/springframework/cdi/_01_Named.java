package com.furkan.springframework.cdi;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//cdi ==> bean
@Named(value = "namedtuto")
// @SessionScoped ==> (Oturum süresince çalışır.)
// @RequestScoped ==> (Sorgu süresince çalışır.)
@ApplicationScoped // ==> (Uygulama süresince çalışır.)
public class _01_Named {

    private Long namedId;
    private String namedData = "Merhabalar Named Cdi Bean";
}
