package br.com.happycode.desafiofrete;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
@RequestMapping(value ="/client")

public class ClientController {

    ClienteDBFake dbFake = new ClienteDBFake();
    RestTemplate restTemplate = new RestTemplate();

//ClienteDBFake dbFake = new ClienteDBFake();
//    @GetMapping("/{cep}")
//    public Cliente consultaCep(@PathVariable("cep") String cep) {
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<Cliente> resp =
//                restTemplate
//                        .getForEntity(String.format("http//viacep.com.br/ws/%s/json/", cep), Cliente.class);
//        return resp.getBody();
//    }

//    @GetMapping("/cep/{cep}")
//
//    public String getExternalData(@PathVariable String cep) {
//      // consomeApiDeCepsUsandoClientJava11(cep);
//      return dbFake.consomeApiDeCepsUsandoClientRestTemplate(cep);
//    }


    @GetMapping("/cep/{cep}")

    public String getExternalData(@PathVariable String cep) {
        // consomeApiDeCepsUsandoClientJava11(cep);
        return dbFake.consomeApiDeCepsUsandoClientRestTemplate(cep);
    }

    @GetMapping
    public List<Cliente> retornaTodosCliente(){

        return dbFake.retornaTodosClientes();
    }

    @GetMapping (value ="/classificar")
    public List<Cliente> retornaTodosClientesClassificados(){

        return dbFake.retornaTodosClientesClassificados();
    }

    @PostMapping
    public void save(@RequestBody Cliente cliente){

        dbFake.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){

        dbFake.delete(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable String id,@RequestBody Cliente cliente) {

        cliente.setId(id);
        dbFake.atualizar(cliente);
    }

    @GetMapping("/{id}")
    public List<Cliente> retornaPorId(@PathVariable String id){

       return dbFake.clientePorId(id);
    }
}
