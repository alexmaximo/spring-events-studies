package br.com.maximo.springeventsstudies.publishers;

import br.com.maximo.springeventsstudies.events.MyEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;
    
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void publish(MyEvent event) {
        this.publisher.publishEvent(event);
    }
}
