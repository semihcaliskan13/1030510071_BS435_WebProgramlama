package org.webp.entity;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long Id;

    @NotBlank
    @Size(max=25)
    private String ProductName;
    private int Price;


    @ManyToOne @NotNull
    private Category parent;

    public Product() {
    }

    public Product getParent() {
        return parent;
    }

    public void setParent(ProductImages parent) {
        this.parent = parent;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = Id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }
    public int getPrice() {
        return Price;
    }
    public void setPrice(int Price) {
        this.Price = Price;
    }

}