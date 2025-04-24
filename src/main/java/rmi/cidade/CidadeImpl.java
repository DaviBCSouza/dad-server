package rmi.cidade;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class CidadeImpl extends UnicastRemoteObject implements ICidadeService {

    private List<Cidade> cidades = new ArrayList<>();

    public CidadeImpl() throws RemoteException {
        super();
        carregarCidades();
    }

    private void carregarCidades() {
        cidades.add(new Cidade("13001", "Manaus", 500000));
        cidades.add(new Cidade("14001", "Manacapuru",120000));
        cidades.add(new Cidade("15001", "Itacoatiara", 100000));
    }

    @Override
    public List<Cidade> getCidades() throws RemoteException {
        return cidades;
    }

    @Override
    public Cidade getCidade(String nome) throws RemoteException {
        for (Cidade cidade : cidades) {
            if (cidade.getNome().equalsIgnoreCase(nome)) {
                return cidade;
            }
        }
        return null;
    }
}
