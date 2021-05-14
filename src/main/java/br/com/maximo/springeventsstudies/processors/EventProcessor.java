package br.com.maximo.springeventsstudies.processors;

import br.com.maximo.springeventsstudies.domain.MyEventPayload;
import br.com.maximo.springeventsstudies.events.MyEvent;
import br.com.maximo.springeventsstudies.publishers.EventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


@Component
public class EventProcessor {
    @Autowired
    private EventPublisher publisher;

    public void process() {
        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(this::builderEvent);
    }

    private void builderEvent(int i) {
        MyEventPayload payload = new MyEventPayload();
        payload.setId(UUID.randomUUID().toString());
        payload.setValue(10);
        MyEvent event = new MyEvent(this, payload);
        publisher.publish(event);
    }
}
