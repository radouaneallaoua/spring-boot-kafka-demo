package net.allaoua.demokafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {


    @Bean   //create a topic
    public NewTopic allaouaTopic(){
        return TopicBuilder.name("allaoua").build();
    }
}
