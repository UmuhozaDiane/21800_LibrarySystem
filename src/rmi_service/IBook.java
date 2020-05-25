/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import model.Category;
import model.Book;

/**
 *
 * @author UMUHOZA Diane 
 */
public interface IBook extends Remote {
    public boolean save(String bookId,String title, String phouse, Date pdate, String author, int pages, String category_1)throws RemoteException;
    public boolean update(String bookId,String title, String phouse, String pdate, String author, int pages, String category_1)throws RemoteException;
    public boolean delete(String bookId)throws RemoteException;
    
}
