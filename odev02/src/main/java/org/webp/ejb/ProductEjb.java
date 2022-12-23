package org.webp.ejb;

import org.webp.Entity.Product
import org.webp.Entity.ProductImages
import org.webp.Entity.Category

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.validation.constraints.NotNull;

@Stateless
public class ProductEjb {

    @PersistenceContext
    private EntityManager entityManager;

    public ProductEjb(){}

    public void addNewProduct(String productName, int price,  int categoryId, int productImagesId){
        CategoryEjb categoryEjb = new CategoryEjb();
        Category category = categoryEjb.getCategory(categoryId);

        ProductImagesEjb productImagesEjb = new ProductImagesEjb();
        ProductImages productImages = productImagesEjb.getProductImages(productImagesId);

        Product product = new Product();
        product.setProductName(productName);
        product.setPrice(price);
       
        product.setProductImages(productImages);
        

        entityManager.persist(product);
    }

    public Product getProductById(long productId){
        Product product = entityManager.find(Product.class,productId);

        return product;
    }

    
}
