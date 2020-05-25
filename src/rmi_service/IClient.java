/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author UMUHOZA Diane
 */
public interface IClient extends Remote{
   public boolean save(String regno, String firstname, String lastname, String phone, String email, 
            String category, String photo) throws RemoteException;
    public boolean update(String regno, String firstname, String lastname, String phone, String email, 
            String category, String photo) throws RemoteException;
     public boolean delete(String regno) throws RemoteException;
       
   
    
}
