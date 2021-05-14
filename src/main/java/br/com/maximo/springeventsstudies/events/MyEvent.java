package br.com.maximo.springeventsstudies.events;

import br.com.maximo.springeventsstudies.domain.MyEventPayload;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
    @Getter
    private MyEventPayload payload;

    public MyEvent(Object source, MyEventPayload payload) {
        super(source);
        this.payload = payload;
    }


}
