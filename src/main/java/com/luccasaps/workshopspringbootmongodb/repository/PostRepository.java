package com.luccasaps.workshopspringbootmongodb.repository;

import com.luccasaps.workshopspringbootmongodb.domain.Post;
import com.luccasaps.workshopspringbootmongodb.dto.AuthorDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findByTitleContainingIgnoreCase(String text);
}
