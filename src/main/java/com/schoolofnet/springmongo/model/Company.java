package com.schoolofnet.springmongo.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "companies")
public class Company {

    @Id
    private String id;

    private String name;

    private List<Person> people;

    public Company(String name, List<Person> people) {
        this.name = name;
        this.people = people;
    }
}
