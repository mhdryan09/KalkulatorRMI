/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_rmi;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Assabil
 */
public class CekServer {
    
    public static void main(String[] args) throws RemoteException{
        Registry registry = LocateRegistry.createRegistry(1099);
        
       OperasiAritmatika ops = new OperasiAritmatika();
       registry.rebind("data", ops);
       
        System.out.println("Server is Ready");
    }
}
