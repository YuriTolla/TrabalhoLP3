package com.tolla.LP3Trabalho.com.tolla.LP3Trabalho.service;

import com.sun.xml.internal.ws.api.message.Header;
import com.tolla.LP3Trabalho.com.tolla.LP3Trabalho.domain.Tempo;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TempoService {
    public RestTemplate template;

    public TempoService(){template = new RestTemplate();}

    public Tempo getTempo(){

        String url = "http://apiadvisor.climatempo.com.br/api/v1/weather/locale/5346/current?token=68120b223fca967bf199c88602d7cc9e";
        HttpHeaders headers = new HttpHeaders();

        headers.set("User-Agent", "PostmanRunTime/7.13.0");
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Tempo> tempo = template.exchange(url, HttpMethod.GET,entity,Tempo.class);

        return tempo.getBody();
    }
}
