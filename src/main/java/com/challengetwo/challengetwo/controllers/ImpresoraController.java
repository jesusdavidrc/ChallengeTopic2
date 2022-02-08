package com.challengetwo.challengetwo.controllers;


import com.challengetwo.challengetwo.dao.IImpresora;
import com.challengetwo.challengetwo.dao.ImpresoraBN;
import com.challengetwo.challengetwo.dao.ImpresoraFullColor;
import com.challengetwo.challengetwo.models.Impresora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/impresoras")
public class ImpresoraController {

    private IImpresora impre = new ImpresoraFullColor();

    @PostMapping
    public void nuevaImpresion(){
        impre.imprimir();
    }
}
