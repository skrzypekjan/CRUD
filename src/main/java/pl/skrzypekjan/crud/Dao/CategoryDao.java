package pl.skrzypekjan.crud.Dao;

import org.springframework.stereotype.Component;
import pl.skrzypekjan.crud.Dao.Entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class CategoryDao {
    @PersistenceContext
    EntityManager entityManager;

    public void save(Category entity) {
        entityManager.persist(entity);
    }

    public Category findById(long id) {
        return entityManager.find(Category.class, id);
    }

    public void update(Category entity) {
        entityManager.merge(entity);
    }

    public void delete(Category entity) {
        entityManager.remove(entityManager.contains(entity) ?
                entity : entityManager.merge(entity));
    }

    public List<Category> findAll() {
        Query query = entityManager.createQuery("SELECT a FROM Category a");
        return query.getResultList();
    }

}
