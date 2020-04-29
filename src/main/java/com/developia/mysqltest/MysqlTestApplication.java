package com.developia.mysqltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Iterator;

@SpringBootApplication
public class MysqlTestApplication implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(MysqlTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Student student = new Student();
        student.setFirstName("Ali");
        student.setLastName("Aliyev");
        student.setEmail("ali@gmail.com");
        student.setPhone("38457834579");

        studentRepository.save(student);

    }
}
