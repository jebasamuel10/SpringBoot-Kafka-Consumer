package com.cts.commerce.notification.payments.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class PaymentKafkaConsumer {

    @KafkaListener(topics = "payment-notification-topic",
            groupId = "pnpagt-Payment-Notification-Processor-Agent")
    // Method
    public void consume(List<String> messages) throws InterruptedException {
        // Print statement
        System.out.println("Start Processing"+new Date() + "Messages. Total count is :"+messages.size());
        for(String msg:messages){
            System.out.println(messages);
        }
        Thread.sleep(10000);
        System.out.println("Messages Processed" + new Date() + messages.size());
    }
}
