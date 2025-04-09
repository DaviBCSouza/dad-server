package rmi.ocupacao;

public class Ocupacao {
    String profissao;
    String cbo;

    public Ocupacao() {
    }

    public Ocupacao(String profissao, String cbo) {
        this.profissao = profissao;
        this.cbo = cbo;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCbo() {
        return this.cbo;
    }

    public void setCbo(String cbo) {
        this.cbo = cbo;
    }
}
