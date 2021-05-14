package br.com.maximo.springeventsstudies.processors;

import br.com.maximo.springeventsstudies.domain.MyEventPayload;
import br.com.maximo.springeventsstudies.events.MyEvent;
import br.com.maximo.springeventsstudies.publishers.EventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.stream.IntStream;


@Component
public class EventProcessor {
    @Autowired
    private EventPublisher publisher;

    public void process() {
        IntStream.of(10).forEach(this::builderEvent);
    }

    private void builderEvent(int i) {
        MyEventPayload payload = new MyEventPayload();
        payload.setId(UUID.randomUUID().toString());
        payload.setValue(10);
        MyEvent event = new MyEvent(this, payload);
        publisher.publish(event);
    }
}
