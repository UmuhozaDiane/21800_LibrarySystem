/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.util.List;
import model.Client;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utility.HibernateUtil;

/**
 *
 * @author UMUHOZA Diane
 */
public class ClientDao {
    public void saveClient(Client o){
        Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction tr =session.beginTransaction();
        session.save(o);
        tr.commit();
        session.close();

    }
    
 public void updateClient(Client o){
        Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction tr =session.beginTransaction();
        session.update(o);
        tr.commit();
        session.close();
 }
 
 public void deleteClient(Client o){
        Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction tr =session.beginTransaction();
        session.delete(o);
        tr.commit();
        session.close();
 }
 
 public List<Client> selectClient(){
        Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction tr =session.beginTransaction();
        Criteria cr = session.createCriteria(Client.class);
        List<Client> cl =cr.list();
        tr.commit();
        session.close();
        return cl;
     
 }
    
}
