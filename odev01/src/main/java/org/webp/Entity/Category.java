package org.webp.entity;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long Id;

    @NotBlank
    @Size(max=25)
    private String CategoryName;


    @NotBlank
    @Size(max=100)
    private String CategoryDescription;



    @ManyToOne @NotNull

    private Product category;

    public Category() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = Id;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategory(String CategoryName) {
        this.CategoryName = CategoryName;
    }


    public void getCategoryDescription() {
        return Description;
    }

    public void setCategoryDescription(String CategoryDescripiton) {
        this.CategoryDescripiton = CategoryDescripiton;
    }
}