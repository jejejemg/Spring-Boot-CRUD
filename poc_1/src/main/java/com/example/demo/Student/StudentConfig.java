package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jem = new Student(
                    "Jem",
                    LocalDate.of(2000, JANUARY, 1),
                    "jem@gmail.com"
            );

            Student marjon = new Student(
                    "Marjon",
                    LocalDate.of(2000, JANUARY, 23),
                    "ken@gmail.com"
            );

            Student carl = new Student(
                    "Carl",
                    LocalDate.of(1999, SEPTEMBER, 7),
                    "carl@gmail.com"
            );

            repository.saveAll(
                    List.of(jem, marjon, carl)
            );
        };
    }
}
