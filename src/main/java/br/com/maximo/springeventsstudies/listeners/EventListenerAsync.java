package br.com.maximo.springeventsstudies.listeners;

import br.com.maximo.springeventsstudies.events.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Component
public class EventListenerAsync implements ApplicationListener<MyEvent> {
    public void onApplicationEvent(MyEvent myEvent) {
        ExecutorService pool = Executors.newCachedThreadPool();

        CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(myEvent.getPayload().getId() + " : " + new Date());
        }, pool);
    }
}
