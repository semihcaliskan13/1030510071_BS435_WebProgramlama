package org.webp.ejb;


import org.webp.Entity.ProductImages;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.validation.constraints.NotNull;

@Stateless
public class ProductImagesEjb {

    @PersistenceContext
    private EntityManager entityManager;

    public ProductImagesEntity(){}


    public ProductImages getProductImages(long productImagesId){
        ProductImages productImages = entityManager.find(ProductImages.class,productImagesId);

        return productImages;
    }
}
