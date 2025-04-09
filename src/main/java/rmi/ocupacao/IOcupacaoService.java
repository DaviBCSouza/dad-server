package rmi.ocupacao;

import java.rmi.RemoteException;
import java.util.List;

public interface IOcupacaoService {
    List<Ocupacao> getListOcupacao() throws RemoteException;
    Ocupacao getOcupacao(String cbo) throws RemoteException;
}
