package br.com.happycode.desafiofrete.service;

import br.com.happycode.desafiofrete.*;
import br.com.happycode.desafiofrete.dto.ClienteDto;
import ch.qos.logback.core.net.server.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;
    private CepService cepService;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository, CepService cepService) {
        this.clienteRepository = clienteRepository;
        this.cepService = cepService ;
    }

    public void save(ClienteDto clienteDto){
        Cep.validar(clienteDto.getCep());

        LocalDate dataAniversario = clienteDto.getAniversario();

        Endereco endereco = cepService.consomeApiCeps(clienteDto.getCep());

        Cliente novoCliente = new Cliente(clienteDto.getNome(), dataAniversario, endereco);

        clienteRepository.save(novoCliente);
    }

    public List<Cliente> retornaTodosCliente(){

        return clienteRepository.findAll();
    }

    public List<Cliente> retornaTodosClientesClassificados(){

        List<Cliente> cliente = clienteRepository.findAll();
        Collections.sort(cliente);

     return cliente;
        // Sort sort = Sort.by(Sort.Direction.ASC, "nome");
        // return clienteRepository.findAll();
    }

    public void delete(String id){
        clienteRepository.deleteById(id);
    }

    //Lição de casa
    public void atualizar(Cliente cliente) {


       clienteRepository.save(cliente);
    }

    public Cliente retornaPorId(String id){
        Optional<Cliente> clienteOpcional = clienteRepository.findById(id);
        return clienteOpcional.get();
    }
}
