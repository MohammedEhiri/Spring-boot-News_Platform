package com.news.news.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "User")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    private String id;
    private String nom;
    private String prenom;
    private String login;
    private String password;
    private String about;
    private List<String> amis;
    private List<String> myNewsList;
}
