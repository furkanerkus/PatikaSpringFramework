package com.furkan.springframework.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;

//Kapsam
//Yaşam Süresi
//Performansızı +, -
@Named(value = "scoprtuto")
// @ApplicationScoped (Uyguluma süresince çalışır ve bütün kullanıcılar için çalışır.)
// @RequestScoped ( 1 istek süresince çalışır.)
//@SessionScoped ( 1 kullanıcı için yaşar. Logout ile çıkar.) (Serializable implementasyonu ile birlikte çalışır.)
//@Dependent Bukelemon (Çağırılan yere göre scope değişiyor. Çağıran dosyanın scope unu alır.)
//@ConversationScoped (Belli istek süresince çalışır.)
public class _00_Scope {
}
