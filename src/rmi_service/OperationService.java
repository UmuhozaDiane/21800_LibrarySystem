/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_service;

import dao.OperationDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Operation;

/**
 *
 * @author UMUHOZA Diane
 */
public class OperationService extends UnicastRemoteObject implements IOperation{

    public OperationService() throws RemoteException {
      super();
    }
    

   @Override
    public boolean save(String clientname, String bookname, String author, Date returndate, String status) throws RemoteException {
       //  try {
          //  DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
            Operation chout = new Operation(clientname, bookname, author, returndate, status);
             OperationDao choutdao= new OperationDao(); 
            choutdao.saveOperation(chout);
            return true;
      //  } catch (Exception ex) {
        //    Logger.getLogger(OperationService.class.getName()).log(Level.SEVERE, null, ex);
        //    return false;
       // }
   }

   
    
    }
    

