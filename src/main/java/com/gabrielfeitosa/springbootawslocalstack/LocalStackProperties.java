package com.gabrielfeitosa.springbootawslocalstack;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Setter
@Getter
@ConfigurationProperties(prefix = "localstack")
public class LocalStackProperties {

    private String sns;
    private String sqs;
}
