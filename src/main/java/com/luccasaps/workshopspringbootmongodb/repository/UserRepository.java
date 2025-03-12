package com.luccasaps.workshopspringbootmongodb.repository;

import com.luccasaps.workshopspringbootmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
