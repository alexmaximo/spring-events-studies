package br.com.maximo.springeventsstudies;

import br.com.maximo.springeventsstudies.processors.EventProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

import static java.lang.System.out;

@SpringBootApplication
public class EventsApplication implements CommandLineRunner {
    @Autowired
    private EventProcessor processor;

    public static void main(String[] args) {
        SpringApplication.run(EventsApplication.class);
    }

    public void run(String... args) throws Exception {
        out.println("Início: " + new Date());
        processor.process();
        out.println("Fim: " + new Date());
    }
}
