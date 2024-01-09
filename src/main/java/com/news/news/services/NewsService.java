package com.news.news.services;

import com.news.news.models.News;
import com.news.news.repositeries.NewsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    private final NewsRepo newsRepo;

    @Autowired
    public NewsService(NewsRepo newsRepo) {
        this.newsRepo = newsRepo;
    }

    public void saveMyDocument(News document) {
        newsRepo.save(document);
    }

    public List<News> getAllDocuments() {
        return newsRepo.findAll();
    }
}
