//package br.com.maximo.springeventsstudies.listeners;
//
//import br.com.maximo.springeventsstudies.events.MyEvent;
//import org.springframework.context.ApplicationListener;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//import java.util.concurrent.TimeUnit;
//
//@Component
//public class EventListenerSync implements ApplicationListener<MyEvent> {
//    public void onApplicationEvent(MyEvent myEvent) {
//        try {
//            TimeUnit.SECONDS.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(myEvent.getPayload().getId() + " : " + new Date());
//    }
//}
