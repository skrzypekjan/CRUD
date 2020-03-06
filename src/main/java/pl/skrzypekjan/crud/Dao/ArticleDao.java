package pl.skrzypekjan.crud.Dao;

import org.springframework.stereotype.Component;
import pl.skrzypekjan.crud.Dao.Entity.Article;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class ArticleDao {
    @PersistenceContext
    EntityManager entityManager;

    public void save(Article entity) {
        entityManager.persist(entity);
    }

    public Article findById(int id) {
        return entityManager.find(Article.class, id);
    }

    public void update(Article entity) {
        entityManager.merge(entity);
    }

    public void delete(Article entity) {
        entityManager.remove(entityManager.contains(entity) ?
                entity : entityManager.merge(entity));
    }


    public List<Article> findAll() {
        Query query = entityManager.createQuery("SELECT a FROM Article a");
        return query.getResultList();
    }

}
