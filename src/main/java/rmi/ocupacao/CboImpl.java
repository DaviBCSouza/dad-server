package rmi.ocupacao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class CboImpl extends UnicastRemoteObject implements ICboService {
    List<Cbo> ocupacoes = new ArrayList<>();

    public CboImpl() throws RemoteException {
        super();
        carregarOcupacoes();
    }

    private void carregarOcupacoes() {
        ocupacoes.add(new Cbo("Médico", "001"));
        ocupacoes.add(new Cbo("Enfermeiro", "002"));
        ocupacoes.add(new Cbo("Téc. em Enfermagem", "003"));
    }

    @Override
    public List<Cbo> getListCbo() throws RemoteException {
        return ocupacoes;
    }

    @Override
    public Cbo getCbo(String cbo) throws RemoteException {
        for (Cbo ocupacao : ocupacoes) {
            if (ocupacao.getCodCbo().equals(cbo)) {
                return ocupacao;
            }
        }
        return null;
    }
}
