package br.com.happycode.desafiofrete;

import br.com.happycode.desafiofrete.dto.ClienteDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value ="/client")

public class ClientController {

    ClienteDBFake dbFake = new ClienteDBFake();
    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/cep/{cep}")
    public Endereco consultaCepEndereco(@PathVariable String cep) {

        return consomeApiCeps(cep);
    }

    public Endereco consomeApiCeps(String cep){
        RestTemplate endereco = new RestTemplate();
        ResponseEntity<Endereco> response = endereco.getForEntity("https://viacep.com.br/ws/" + cep + "/json/", Endereco.class);
        return response.getBody();
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
    public void save(@RequestBody ClienteDto clienteDto){
        Cep.validar(clienteDto.getCep());

        LocalDate dataAniversario = clienteDto.getAniversario();

        Endereco endereco = consomeApiCeps(clienteDto.getCep());

        Cliente novoCliente = new Cliente(clienteDto.getNome(), dataAniversario, endereco);

        dbFake.save(novoCliente);
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
