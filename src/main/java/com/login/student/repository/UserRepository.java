package com.login.student.repository;

import com.login.student.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String >{
    Optional<User> findByUserName(String username);
}
