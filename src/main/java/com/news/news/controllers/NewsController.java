package com.news.news.controllers;

import com.news.news.models.News;
import com.news.news.services.NewsService;
import com.news.news.services.UserServcie;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;




@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;
    @Autowired
    private UserServcie userServcie;


    @GetMapping("/home")
    public String showAddNewsForm(Model model) {
        model.addAttribute("news" , newsService.getAllDocuments());

        return "home";
    }

    @PostMapping("/add-news")
    public String addNews(@RequestParam("url") String link) throws IOException {
        Connection connection = Jsoup.connect(link);
        Document document = connection.get();

        String title = document.title();

        Element descriptionElement = document.select("meta[name=description]").first();
        String description = "";
        if (descriptionElement != null) {
            description = descriptionElement.attr("content");
        }

        String imageUrl = "";
        Elements imageElements = document.select("img");
        if (!imageElements.isEmpty()) {
            imageUrl = imageElements.first().attr("src");
        }

        newsService.saveMyDocument(News.builder()
                                        .url(link)
                                        .title(title)
                                        .description(description)
                                        .imageUrl(imageUrl)
                                        .build());

        return "redirect:/news/home";
    }
}
