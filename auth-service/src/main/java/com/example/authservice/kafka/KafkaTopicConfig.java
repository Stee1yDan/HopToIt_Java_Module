package com.example.authservice.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig
{
    @Bean
    public NewTopic emailTopic()
    {
        return TopicBuilder.name("emailTopic")
                .build();
    }

    @Bean
    public NewTopic registerTopic()
    {
        return TopicBuilder.name("registerTopic")
                .build();
    }
}