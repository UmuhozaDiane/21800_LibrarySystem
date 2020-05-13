/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Book;
import model.Category;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utility.HibernateUtil;

/**
 *
 * @author UMUHOZA Diane
 */
public class BookDao {
    
      public void saveBook(Book ob){
        Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction tr =session.beginTransaction();
        session.save(ob);
        tr.commit();
        session.close();

    }
   
    
    
 public void updateBook(Book o){
        Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction tr =session.beginTransaction();
        session.update(o);
        tr.commit();
        session.close();
 }
 
 public void deleteBook(Book o){
        Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction tr =session.beginTransaction();
        session.delete(o);
        tr.commit();
        session.close();
 }
 
  public List<Book> selectBook(){
        Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction tr =session.beginTransaction();
        Criteria cr = session.createCriteria(Book.class);
        List<Book> cl =cr.list();
        tr.commit();
        session.close();
        return cl; 
     
 }
    public List<String> getCategoryName(){
        
         List<String> cat = new ArrayList<String>();
            Transaction tr =null;
        Session session = HibernateUtil.getSessionFactory().openSession(); 
        tr =session.beginTransaction();
        cat=session.createQuery("SELECT categoryName from Category").list();
        session.close();
        return cat ;
    }
       
      
  
       
       
       
     
  
    
}
