package com.gabrielfeitosa.springbootawslocalstack;

import org.springframework.cloud.aws.messaging.config.annotation.NotificationMessage;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerMessage {

    @SqsListener(value = "${queue.name}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void listener(@NotificationMessage String message) {
        System.out.println(message);
    }
}
