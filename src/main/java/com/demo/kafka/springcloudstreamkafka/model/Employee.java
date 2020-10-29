package com.demo.kafka.springcloudstreamkafka.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    private int id;
    private String name;
    private double salary;
    private String address;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}
