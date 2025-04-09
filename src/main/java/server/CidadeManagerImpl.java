package server;

import model.Cidade;
import rmi.ICidadeManager;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class CidadeManagerImpl extends UnicastRemoteObject implements ICidadeManager {

    private List<Cidade> cidades = new ArrayList<>();

    protected CidadeManagerImpl() throws RemoteException {
        super();
    }

    private void carregarCidades() {
        cidades.add(new Cidade("13001", "Manaus", "Amazonas"));
        cidades.add(new Cidade("14001", "Manacapuru", "Amazonas"));
        cidades.add(new Cidade("15001", "Itacoatiara", "Amazonas"));
    }

    @Override
    public Cidade getCidade(int index) throws RemoteException {
        return cidades.get(index);
    }
}
