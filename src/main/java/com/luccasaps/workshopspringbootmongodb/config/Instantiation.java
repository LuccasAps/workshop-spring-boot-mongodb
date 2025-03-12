package com.luccasaps.workshopspringbootmongodb.config;

import com.luccasaps.workshopspringbootmongodb.domain.Post;
import com.luccasaps.workshopspringbootmongodb.domain.User;
import com.luccasaps.workshopspringbootmongodb.repository.PostRepository;
import com.luccasaps.workshopspringbootmongodb.repository.UserRepository;
import com.luccasaps.workshopspringbootmongodb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        Post post1 = new Post(null, sdf.parse("21/03/2018"),"Partiu Viagem", "Vou viajar para São Paulo. Abraços!", maria);
        Post post2 = new Post(null, sdf.parse("2018/03/23"),"Bom dia","Acordei feliz hoje!", maria);

        userRepository.saveAll(Arrays.asList(maria,alex,bob));
        postRepository.saveAll(Arrays.asList(post1,post2));
    }
}
