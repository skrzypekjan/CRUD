package pl.skrzypekjan.crud.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.skrzypekjan.articlesboot.Dao.Entity.Article;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

    @Query(value = "SELECT * FROM articles ORDER BY id DESC LIMIT 5",
            nativeQuery = true)
    List<Article> findLastFive();

}
