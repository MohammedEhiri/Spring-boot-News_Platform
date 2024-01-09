package com.news.news.models;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "News")

@Data @Builder @AllArgsConstructor @NoArgsConstructor
public class Commentaire {
    @Id
    private String id;
    private String texte;
    private String auteurId;
    private Date date;
}
