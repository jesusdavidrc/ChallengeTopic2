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
public class ImpresoraController {

    @RequestMapping("/impresionbn")
    public void imprimiBn(){
        IImpresora imprimirbn = new ImpresoraBN();
        imprimirbn.imprimir();
    }

    @RequestMapping("/impresionbnc")
    public void imprimiBnc(){
        IImpresora imprimirbnc = new ImpresoraFullColor();
        imprimirbnc.imprimir();
    }
}




