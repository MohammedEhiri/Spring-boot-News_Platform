package com.news.news.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "News")
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class News {
    @Id
    private String id;
    private String url;
    //private String addedByUserId;
    //private int likes;
    //private int dislikes;
    //private Date dateAdded;
    private String title;
    //private List<String> commentList;
    private String description;
    private String imageUrl;
    //private List<String> likedByUserIds;
    //private List<String> dislikedByUserIds;
}
