package br.com.happycode.desafiofrete;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepService {

    @Value("${calculadorafrete.cepservice.url}")
    private String url;
    private RestTemplate restTemplate;

    public CepService(RestTemplate endereco) {

       this.restTemplate = endereco;
    }

    public Endereco consomeApiCeps(String cep){

        ResponseEntity<Endereco> response = restTemplate.getForEntity(url + cep + "/json/", Endereco.class);
        return response.getBody();
    }
}
