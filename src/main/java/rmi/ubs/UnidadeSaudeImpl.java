package rmi.ubs;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class UnidadeSaudeImpl extends UnicastRemoteObject implements IUnidadeSaudeService {
    List<UnidadeSaude> unidadesSaude = new ArrayList<>();

    public UnidadeSaudeImpl() throws RemoteException {
        super();
        carregarUBS();
    }

    private void carregarUBS() {
        unidadesSaude.add(new UnidadeSaude("20546", "UBS Central"));
        unidadesSaude.add(new UnidadeSaude("22489", "UBS Centro-Sul"));
    }

    @Override
    public List<UnidadeSaude> getAll() throws RemoteException {
        return unidadesSaude;
    }

    @Override
    public UnidadeSaude getByCNES(String cnes) throws RemoteException {
        for (UnidadeSaude unidadeSaude : unidadesSaude) {
            if (unidadeSaude.getCnes().equals(cnes)) {
                return unidadeSaude;
            }
        }
        return null;
    }
}
