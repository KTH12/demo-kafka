package com.demo.kafka.springcloudstreamkafka.rest;

import com.demo.kafka.springcloudstreamkafka.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeePublisher {

    @Autowired
    private MessageChannel output;

    @PostMapping()
    public Employee sendEmp(@RequestBody Employee employee) {
        output.send(MessageBuilder.withPayload(employee).build());
        return employee;
    };


}
