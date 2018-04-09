package graphql.repositories;

import graphql.models.Article;
import org.bson.types.ObjectId;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ArticleRepository extends PagingAndSortingRepository<Article,ObjectId> {
    List<Article> findByIdIn(List<String> articleIds);
}
