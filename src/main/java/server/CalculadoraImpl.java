package server;

import rmi.ICalculadora;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements ICalculadora {


    protected CalculadoraImpl() throws RemoteException {
        super();
    }

    @Override
    public int somar(int valor1, int valor2) throws RemoteException {
        return valor1 + valor2;
    }

    @Override
    public int subtrair(int valor1, int valor2) throws RemoteException {
        return valor1 - valor2;
    }
}
