package com.furkan.springframework.aop.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesiciAsilIs {

    @AroundInvoke public Object loglama(InvocationContext context) {
        System.out.println("ilk hali: " + context.getMethod().getName());

        //kullanıcı giriş yapmış mı?
        boolean isLogin = true; // Yol kesici olacak değişkenimiz
        Object isContinue = null; // Eğer yol kesilmezse devam edecek

        if(isLogin) { // isLogin true ise yol keser yoksa burayı atlar ve "isContinue" ya geçer.
            //Önce sisteme giriş yapsın.
            System.out.println("Sisteme giriş yapmalısınız!!!");
            return null;
        }else {
            try {
                isContinue = context.proceed(); // Sistemin devam etmesini sağlamak
                System.out.println("Sonraki hali " + isContinue);
            }catch (Exception e) {
                e.printStackTrace();
            }
            return isContinue;
        }
    }

}
