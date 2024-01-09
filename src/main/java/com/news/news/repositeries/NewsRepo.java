package com.news.news.repositeries;

import com.news.news.models.News;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsRepo extends MongoRepository<News , String> {
}
