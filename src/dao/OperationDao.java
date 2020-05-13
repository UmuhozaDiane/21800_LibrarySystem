/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;



import java.util.List;
import model.Operation;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;
import utility.HibernateUtil;

/**
 *
 * @author UMUHOZA Diane
 */
public class OperationDao {
    
      public void saveOperation(Operation o){
        Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction tr =session.beginTransaction();
        session.save(o);
        tr.commit();
        session.close();

    }
      
     public List<Operation> selectOperation(){
         Session session = HibernateUtil.getSessionFactory().openSession();
         Transaction tr = session.beginTransaction();
         Criteria cr = session.createCriteria(Operation.class);
         List<Operation> cl = cr.list();
         tr.commit();
         session.close();
         return cl;
         
     }
     
      
      
    
    
}
