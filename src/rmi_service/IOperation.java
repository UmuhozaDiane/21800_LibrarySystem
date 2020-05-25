/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

/**
 *
 * @author UMUHOZA Diane
 */
public interface IOperation  extends Remote{
    public boolean save(String clientname, String bookname, String author, 
            Date returndate, String status) throws RemoteException;
    
}
