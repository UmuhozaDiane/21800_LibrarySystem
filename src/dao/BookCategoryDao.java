/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Category;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utility.HibernateUtil;

/**
 *
 * @author UMUHOZA Diane
 */
public class BookCategoryDao {
        public void saveBookCategory(Category o){
        Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction tr =session.beginTransaction();
        session.save(o);
        tr.commit();
        session.close();

    }
    
 public void updateBookCategory(Category  o){
        Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction tr =session.beginTransaction();
        session.update(o);
        tr.commit();
        session.close();
 }
 
 public void deleteBookCategory(Category  o){
        Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction tr =session.beginTransaction();
        session.delete(o);
        tr.commit();
        session.close();
 }
 
  public List<Category > selectBookCategory(){
        Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction tr =session.beginTransaction();
        Criteria cr = session.createCriteria(Category .class);
        List<Category > cl =cr.list();
        tr.commit();
        session.close();
        return cl; 
     
 }
    
}
