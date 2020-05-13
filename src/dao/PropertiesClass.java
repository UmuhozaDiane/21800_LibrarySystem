/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao; 

import java.io.FileReader;
import java.util.Properties;

/**
 *
 * @author UMUHOZA Diane
 */
public class PropertiesClass {
    public static void main(String[] args) throws Exception{
       Properties pro = new Properties(); 
        FileReader frd = new FileReader("C:\\Users\\UMUHOZA Diane\\Documents\\NetBeansProjects\\21800_librarysystem\\src\\dao\\PropertiesFile.properties");
   
        pro.load(frd);
        String username = pro.getProperty("username");
        String password =pro.getProperty("password");
        System.out.println("The Username is:"+username+" "+password);
        System.out.println("The password is:"+password);

        
        
    }
}
