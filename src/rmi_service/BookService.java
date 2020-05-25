/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_service;

import dao.BookDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Book;
import model.Category;

/**
 *
 * @author UMUHOZA Diane
 */
public class BookService extends UnicastRemoteObject implements IBook {

    public BookService() throws RemoteException {
        super();
    }
    @Override
    public boolean save(String bookId, String title, String phouse, Date pdate, String author, int pages, String category_1) throws RemoteException {
        // try {
           // DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
            
            Book b = new Book(bookId, title, phouse, pdate, author, pages, category_1);
            BookDao bdao = new BookDao();
            bdao.saveBook(b);
            return true;
       // } catch (ParseException ex) {
        //    Logger.getLogger(BookService.class.getName()).log(Level.SEVERE, null, ex);
         //   return false;
       // }
        
    }

    @Override
    public boolean update(String bookId, String title, String phouse, String pdate, String author, int pages, String category_1) throws RemoteException {
         try {
            DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
               
            
            Book b = new Book(bookId, title, phouse, df.parse(pdate), author, pages, category_1);
            BookDao bdao = new BookDao();
            bdao.updateBook(b);
            return true;
        } catch (ParseException ex) {
            Logger.getLogger(BookService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean delete(String bookId) throws RemoteException {
         try {
           
            
            Book b = new Book(bookId);
            BookDao bdao = new BookDao();
            bdao.deleteBook(b);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(BookService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
