package com.schoolofnet.springmongo.repository;

import com.schoolofnet.springmongo.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, String> {

}
