package com.example.etc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;

import java.util.Objects;

/**
 * Created at 2022-12-20
 * Site ->
 * Link ->
 * Level ->
 * Topic ->
 */
public class JacksonMapperTest {

    public static void main(String[] args) throws JsonProcessingException {
        Employee employee = new Employee("Server", "Johnson", 140000);
        ObjectMapper obJectMapper = new ObjectMapper();
        String employeeJson = obJectMapper.writeValueAsString(employee);


        Employee object = obJectMapper.readValue(employeeJson, Employee.class);
        System.out.println(object);
    }
}
