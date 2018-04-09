package graphql.services;

import graphql.models.Article;
import org.springframework.stereotype.Component;

import java.util.List;

public interface ArticleService {
    List<Article> findAllUserArticles(List<String> articleIds);
}
