package org.webp.ejb;


import org.webp.Entity.Category;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CategoryEjb {

    @PersistenceContext
    private EntityManager entityManager;

    public CategoryEjb(){}

    public Category getCategory(long categoryId){
        Category category = entityManager.find(Category.class,categoryId);

        return category;
    }
}
