package server;

import rmi.ICalculadora;
import rmi.ICidadeManager;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorCidadeRMI {

    public static void main(String[] args) {
        try {
            String host = "localhost";
            int port = 2000;
            String url = "rmi://" + host + ":" + port + "/cidadesJacke&Davi";
            ICidadeManager cidade = new CidadeManagerImpl();

            Registry registry = LocateRegistry.createRegistry(port);

            registry.rebind(url, cidade);

            System.out.println("Servidor RMI iniciado");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
