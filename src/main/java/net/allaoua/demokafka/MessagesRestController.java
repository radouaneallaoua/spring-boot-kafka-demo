package net.allaoua.demokafka;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
public class MessagesRestController {

    final private KafkaTemplate<String, Customer> kafkaTemplate;

    public MessagesRestController(KafkaTemplate<String, Customer> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public void publish(@RequestBody Customer customer){
           kafkaTemplate.send("allaoua", customer);
    }
}
