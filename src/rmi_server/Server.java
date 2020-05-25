/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi_service.BookCategoryService;
import rmi_service.BookService;
import rmi_service.ClientService;
import rmi_service.OperationService;

/**
 *
 * @author UMUHOZA Diane
 */
public class Server {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(2001);
            registry.rebind("clientservice", new ClientService());
            registry.rebind("bookservice", new BookService());
            registry.rebind("bookcategoryservice", new BookCategoryService());
            registry.rebind("operationservice", new OperationService());
            System.out.println("Server Started!!");
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

