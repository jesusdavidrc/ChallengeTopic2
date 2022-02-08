package com.challengetwo.challengetwo.dao;

import com.challengetwo.challengetwo.models.Impresora;
import org.springframework.stereotype.Repository;

@Repository
public class ImpresoraBN implements IImpresora {
    @Override
    public void imprimir() {
        System.out.println("Impresion Blanco y Negro");

    }
}
