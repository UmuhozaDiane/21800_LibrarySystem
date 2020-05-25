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
public interface IBookCategory extends Remote{
    public  boolean save(String categoryId, String categoryName) throws RemoteException;
    public  boolean update(String categoryId, String categoryName) throws RemoteException;
    public  boolean delete(String categoryId) throws RemoteException;
    
    
}
