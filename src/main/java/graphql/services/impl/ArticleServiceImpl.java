package graphql.services.impl;

import graphql.models.Article;
import graphql.repositories.ArticleRepository;
import graphql.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
    ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> findAllUserArticles(List<String> articleIds) {
        return articleRepository.findByIdIn(articleIds);
    }
}
