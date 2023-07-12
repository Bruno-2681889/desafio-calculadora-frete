package br.com.happycode.desafiofrete;

import br.com.happycode.desafiofrete.dto.ClienteDto;
import br.com.happycode.desafiofrete.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/client")

public class ClientController {

    private ClienteService clienteService;

    public ClientController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public void save(@RequestBody ClienteDto clienteDto){
        clienteService.save(clienteDto);
    }

    @GetMapping
    public List<Cliente> retornaTodosCliente(){

        return clienteService.retornaTodosCliente();
    }

    @GetMapping (value ="/classificar")
    public List<Cliente> retornaTodosClientesClassificados(){

        return clienteService.retornaTodosClientesClassificados();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        clienteService.delete(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable String id,@RequestBody Cliente cliente) {
        cliente.setId(id);
        clienteService.atualizar(cliente);
    }

    @GetMapping("/{id}")
    public List<Cliente> retornaPorId(@PathVariable String id){

        return clienteService.retornaPorId(id);
    }
}
