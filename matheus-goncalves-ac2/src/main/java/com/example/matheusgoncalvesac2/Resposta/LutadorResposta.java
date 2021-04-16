package com.example.matheusgoncalvesac2.Resposta;

public class LutadorResposta {

private int idLutadorBate;
private int idLutadorApanha;

    public LutadorResposta(int idLutadorBate, int idLutadorApanha) {
        this.idLutadorBate = idLutadorBate;
        this.idLutadorApanha = idLutadorApanha;
    }

    public int getIdLutadorBate() {
        return idLutadorBate;
    }

    public void setIdLutadorBate(int idLutadorBate) {
        this.idLutadorBate = idLutadorBate;
    }

    public int getIdLutadorApanha() {
        return idLutadorApanha;
    }

    public void setIdLutadorApanha(int idLutadorApanha) {
        this.idLutadorApanha = idLutadorApanha;
    }
}
