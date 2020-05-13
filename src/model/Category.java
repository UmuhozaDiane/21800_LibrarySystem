package model;
// Generated May 12, 2020 12:37:21 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
public class Category  implements java.io.Serializable {


     private String categoryId;
     private String categoryName;
     private Set books = new HashSet(0);

    public Category() {
    }

	
    public Category(String categoryId) {
        this.categoryId = categoryId;
    }
    public Category(String categoryId, String categoryName, Set books) {
       this.categoryId = categoryId;
       this.categoryName = categoryName;
       this.books = books;
    }
   
    public String getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Set getBooks() {
        return this.books;
    }
    
    public void setBooks(Set books) {
        this.books = books;
    }




}

