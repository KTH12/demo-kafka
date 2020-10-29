package com.demo.kafka.springcloudstreamkafka;

import com.demo.kafka.springcloudstreamkafka.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
@EnableBinding({Source.class, Sink.class})
public class SpringcloudstreamkafkaApplication {

    private static String TOPIC_NAME = "testtopic";
//    private static String GROUP_ID = "testgroup";
    private static String BOOTSTRAP_SERVERS = "3.35.239.253:9092";

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudstreamkafkaApplication.class, args);
    }

    @StreamListener("input")
    public void consumMessage(Employee emp) {
        System.out.print(emp.toString());
    }

}
