package com.news.news.repositeries;

import com.news.news.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User , String> {
    User findByLoginAndPassword(String login, String password);
}
