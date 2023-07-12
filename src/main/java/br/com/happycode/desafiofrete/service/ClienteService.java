package br.com.happycode.desafiofrete.service;

import br.com.happycode.desafiofrete.*;
import br.com.happycode.desafiofrete.dto.ClienteDto;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClienteService {

    private ClienteDBFake dbFake;
    private CepService cepService;

    public ClienteService(ClienteDBFake dbFake, CepService cepService) {
        this.dbFake = dbFake;
        this.cepService = cepService ;
    }

    public void save(ClienteDto clienteDto){
        Cep.validar(clienteDto.getCep());

        LocalDate dataAniversario = clienteDto.getAniversario();

        Endereco endereco = cepService.consomeApiCeps(clienteDto.getCep());

        Cliente novoCliente = new Cliente(clienteDto.getNome(), dataAniversario, endereco);

        dbFake.save(novoCliente);
    }

    public List<Cliente> retornaTodosCliente(){

        return dbFake.retornaTodosClientes();
    }

    public List<Cliente> retornaTodosClientesClassificados(){

        return dbFake.retornaTodosClientesClassificados();
    }

    public void delete(String id){
        dbFake.delete(id);
    }

    public void atualizar(Cliente cliente) {

        dbFake.atualizar(cliente);
    }

    public List<Cliente> retornaPorId(String id){

        return dbFake.clientePorId(id);
    }
}
