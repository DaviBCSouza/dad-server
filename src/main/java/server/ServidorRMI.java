package server;

import rmi.cidade.CidadeImpl;
import rmi.ocupacao.CboImpl;
import rmi.ubs.UnidadeSaudeImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            String host = "10.100.32.40";
            int port = 2000;

            String urlUnidadeSaude = "rmi://" + host + ":" + port + "/unidadesSaude";
            //String urlCidade = "rmi://" + host + ":" + port + "/cidades";
            String urlOcupacao = "rmi://" + host + ":" + port + "/ocupacoes";

            System.setProperty("java.rmi.server.hostname", host);

            Registry registry = LocateRegistry.createRegistry(port);

            //registry.rebind(urlCidade, new CidadeImpl());
            registry.rebind(urlOcupacao, new CboImpl());
            registry.rebind(urlUnidadeSaude, new UnidadeSaudeImpl());

            System.out.println("Servidor RMI iniciado");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// PARA CONSULTAR MAIS TARDE
//            String urlCidade = "rmi://" + host + ":" + port + "/cidades";
//            String urlOcupacao = "rmi://" + host + ":" + port + "/ocupacoes";

//            registry.rebind(urlCidade, new CidadeImpl());
//            registry.rebind(urlOcupacao, new CboImpl());
