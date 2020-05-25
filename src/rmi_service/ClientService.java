/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_service;

import dao.ClientDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import model.Client;

/**
 *
 * @author UMUHOZA Diane
 */
public class ClientService extends UnicastRemoteObject implements IClient{

    public ClientService() throws RemoteException {
        super();
    }
    

    @Override
    public boolean save(String regno, String firstname, String lastname, String phone, String email, String category, String photo) throws RemoteException {
       Client c = new Client(regno ,firstname ,lastname ,phone , email, category, photo);
        ClientDao cdao = new ClientDao();
        cdao.saveClient(c);
        return true;
    }

    @Override
    public boolean update(String regno, String firstname, String lastname, String phone, String email, String category, String photo) throws RemoteException {
         Client c = new Client(regno ,firstname ,lastname ,phone , email, category, photo);
        ClientDao cdao = new ClientDao();
        cdao.updateClient(c);
        return true;
    }

    @Override
    public boolean delete(String regno) throws RemoteException {
         Client c = new Client(regno);
        ClientDao cdao = new ClientDao();
        cdao.deleteClient(c);
        return true;
    }
    
    
}
