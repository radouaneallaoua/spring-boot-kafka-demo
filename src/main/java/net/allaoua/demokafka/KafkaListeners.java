package net.allaoua.demokafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "allaoua",groupId = "groupId")
    void listener(Customer data){
        System.out.println("+++++++++++++listener received data: " + data.getEmail() + " :)");
    }
}
