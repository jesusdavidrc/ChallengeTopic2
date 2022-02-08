package com.challengetwo.challengetwo.models;

public class Impresora {
    private int idImpresora;
    private String Marca;

    public int getIdImpresora() {
        return idImpresora;
    }

    public void setIdImpresora(int idImpresora) {
        this.idImpresora = idImpresora;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "idImpresora=" + idImpresora +
                ", Marca='" + Marca + '\'' +
                '}';
    }
}
