package services;

import models.Article;

import java.util.List;

public interface ArticleService {
    List<Article> findAllUserArticles(List<String> articleIds);
}
