package br.com.happycode.desafiofrete;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping ("consulta-cep")
public class ClienteDB {

    @GetMapping("{cep}")
    public Cliente consultaCep(@PathVariable("cep") String cep){
        RestTemplate dbFake = new RestTemplate();
        ResponseEntity <Cliente> resp = dbFake.getForEntity(String.format("http://viacep.com.br/ws/%s/json/",cep ),Cliente.class);
        return resp.getBody();
    }
}
