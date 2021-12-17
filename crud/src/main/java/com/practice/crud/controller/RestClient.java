package com.practice.crud.controller;

import com.practice.crud.model.Employee;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RestClient {

    private static final String SAVE_EMPLOYEE_API = "http://localhost:8080/api/employees";
    private static final String GET_ALL_EMPLOYEES_API = "http://localhost:8080/api/employees";
    private static final String GET_EMPLOYEE_BY_ID_API = "http://localhost:8080/api/employees/{id}";
    private static final String UPDATE_EMPLOYEE_API = "http://localhost:8080/api/employees/{id}";
    private static final String DELETE_EMPLOYEE_API = "http://localhost:8080/api/employees/{id}";

    static RestTemplate restTemplate = new RestTemplate();
    public static void main(String[] args) {
        callGetAllEmployeesAPI();
        callGetEmployeesByIdAPI();
        callSaveEmployeeAPI();
        callUpdateEmployeeAPI();
        callDeleteEmployeeAPI();
    }

    private static void callGetAllEmployeesAPI(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        ResponseEntity<String> result = restTemplate.exchange(GET_ALL_EMPLOYEES_API, HttpMethod.GET, entity, String.class);
        System.out.println(result);
    }

    private static void callGetEmployeesByIdAPI() {
        Map<String, Integer> param = new HashMap<>();
        param.put("id", 3);

        Employee employee = restTemplate.getForObject(GET_EMPLOYEE_BY_ID_API, Employee.class, param);
        System.out.println(employee.getFirstname());
        System.out.println(employee.getLastname());
        System.out.println(employee.getEmail());
    }

    private static void callSaveEmployeeAPI() {
        Employee employee = new Employee("Bukunola", "Oso", "suliat@gmail.com");

        ResponseEntity<Employee> newEmployee = restTemplate.postForEntity(SAVE_EMPLOYEE_API, employee, Employee.class);
        System.out.println(newEmployee.getBody());
    }

    private static void callUpdateEmployeeAPI() {
        Map<String, Integer> param = new HashMap<>();
        param.put("id", 1);
        Employee updateEmployee = new Employee("BBS", "Idris", "easyniyi2003@yahoo.com");
        restTemplate.put(UPDATE_EMPLOYEE_API, updateEmployee, param);
    }

    private static void callDeleteEmployeeAPI(){
        Map<String, Integer> param = new HashMap<>();
        param.put("id", 3);
        restTemplate.delete(DELETE_EMPLOYEE_API, param);
    }
}
