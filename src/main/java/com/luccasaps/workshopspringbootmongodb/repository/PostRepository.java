package com.luccasaps.workshopspringbootmongodb.repository;

import com.luccasaps.workshopspringbootmongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
