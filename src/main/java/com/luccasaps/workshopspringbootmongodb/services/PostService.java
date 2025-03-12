package com.luccasaps.workshopspringbootmongodb.services;

import com.luccasaps.workshopspringbootmongodb.domain.Post;
import com.luccasaps.workshopspringbootmongodb.domain.User;
import com.luccasaps.workshopspringbootmongodb.repository.PostRepository;
import com.luccasaps.workshopspringbootmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return repo.searchTitle(text);
    }

    public List<Post> fullSearch(String text, Date minDate, Date maxDate){
        maxDate = new Date(maxDate.getTime() + 1000 * 60 * 60 * 24);
        return repo.fullSearch(text, minDate, maxDate);
    }
}
