package com.news.news.repositeries;

import com.news.news.models.Commentaire;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentaireRepo extends MongoRepository<Commentaire , String> {
}
