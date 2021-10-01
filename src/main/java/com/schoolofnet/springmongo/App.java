package com.schoolofnet.springmongo;


import com.schoolofnet.springmongo.model.Company;
import com.schoolofnet.springmongo.model.Person;
import com.schoolofnet.springmongo.repository.CompanyRepository;
import com.schoolofnet.springmongo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public void run(String... args) throws Exception {
        Person person1 = new Person("Samuel");
        Person savePerson = this.personRepository.save(person1);

        Company company = new Company("School Of Net", Arrays.asList(savePerson));
        this.companyRepository.save(company);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringmongoApplication.class, args);
    }
}
