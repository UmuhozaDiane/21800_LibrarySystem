/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_service;

import dao.BookCategoryDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import model.Category;

/**
 *
 * @author UMUHOZA Diane
 */
public class BookCategoryService extends UnicastRemoteObject implements IBookCategory {

    public BookCategoryService() throws RemoteException {
        super();
    }
    

    @Override
    public boolean save(String categoryId, String categoryName) throws RemoteException {
       Category bc = new Category(categoryId, categoryName);
       BookCategoryDao bcd = new BookCategoryDao();
       bcd.saveBookCategory(bc);
       return true;
    }

    @Override
    public boolean update(String categoryId, String categoryName) throws RemoteException {
       Category bc = new Category(categoryId, categoryName);
       BookCategoryDao bcd = new BookCategoryDao();
       bcd.updateBookCategory(bc);
       return true;  
    }

    @Override
    public boolean delete(String categoryId) throws RemoteException {
        Category bc = new Category(categoryId);
       BookCategoryDao bcd = new BookCategoryDao();
       bcd.deleteBookCategory(bc);
       return true;
    }
    
}
