package com.luccasaps.workshopspringbootmongodb.services;

import com.luccasaps.workshopspringbootmongodb.domain.User;
import com.luccasaps.workshopspringbootmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
