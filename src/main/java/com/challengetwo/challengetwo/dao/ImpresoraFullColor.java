package com.challengetwo.challengetwo.dao;

import com.challengetwo.challengetwo.models.Impresora;
import org.springframework.stereotype.Repository;


@Repository
public class ImpresoraFullColor implements IImpresora {

    @Override
    public void imprimir() {
        System.out.println("Impresion Blanco/Negro y Color");

    }

}
