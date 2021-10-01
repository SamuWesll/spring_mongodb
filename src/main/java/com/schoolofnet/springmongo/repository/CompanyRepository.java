package com.schoolofnet.springmongo.repository;

import com.schoolofnet.springmongo.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyRepository extends MongoRepository<Company, String> {
}
