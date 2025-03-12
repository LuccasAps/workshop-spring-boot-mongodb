package com.luccasaps.workshopspringbootmongodb.repository;

import com.luccasaps.workshopspringbootmongodb.domain.Post;
import com.luccasaps.workshopspringbootmongodb.dto.AuthorDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {

    @Query("{'title' :  { $regex:  ?0, $options: 'i' }}")
    List<Post> searchTitle(String text);

    List<Post> findByTitleContainingIgnoreCase(String text);
}
