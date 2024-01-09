package com.news.news.services;

import com.news.news.models.User;
import com.news.news.repositeries.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServcie {
    private final UserRepo userRepo;

    @Autowired
    public UserServcie(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void saveMyDocument(User document) {
        userRepo.save(document);
    }

    public List<User> getAllDocuments() {
        return userRepo.findAll();
    }
    public User findByLogin(String login , String password){
        return userRepo.findByLoginAndPassword(login,password);
    }

}
