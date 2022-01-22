package ru.sestanovov.spring.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.sestanovov.spring.rest.configuration.MyConfig;
import ru.sestanovov.spring.rest.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        System.out.println(communication.getAllEmployees());
//        System.out.println(communication.getEmployee(4));
//        Employee employee = new Employee("Sveta", "Sokolova", "HR", 1200);
//        employee.setId(6);
//        communication.saveEmployee(employee);
        communication.deleteEmployee(6);
    }
}
