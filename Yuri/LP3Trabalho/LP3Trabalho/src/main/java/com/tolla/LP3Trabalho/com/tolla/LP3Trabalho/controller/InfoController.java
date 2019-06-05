package com.tolla.LP3Trabalho.com.tolla.LP3Trabalho.controller;

import com.tolla.LP3Trabalho.com.tolla.LP3Trabalho.domain.Info;
import com.tolla.LP3Trabalho.com.tolla.LP3Trabalho.domain.Tempo;
import com.tolla.LP3Trabalho.com.tolla.LP3Trabalho.service.TempoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {
    @Autowired
    TempoService tempoService;
    /*@Autowired
    ZenService zenService;
    @Autowired
    SecretoService secretoService;*/
    @PostMapping
    public ResponseEntity<Info> buscaInfo() {
        Tempo tempo = tempoService.getTempo();
        /*
        Zen zen = zenService.getZen();
        Secreto secreto = secretoService.getSecreto();
        */
        Info info = new Info();
        info.setTempo(tempo);
        /*
        info.setZen(zen);
        info.setSecreto(secreto);*/
        return new ResponseEntity<Info>(info, HttpStatus.OK);
    }
}
