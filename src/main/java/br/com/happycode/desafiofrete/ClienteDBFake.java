package br.com.happycode.desafiofrete;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class ClienteDBFake {

    private static List<Cliente> tabelaClientes = new ArrayList();

    public void save(Cliente cliente){

        String id = gerarId();
        cliente.setId(id);

        tabelaClientes.add(cliente);
    }

    public String consomeApiDeCepsUsandoClientRestTemplate(String cep){
        RestTemplate client = new RestTemplate();
        ResponseEntity<String> response = client.getForEntity("https://viacep.com.br/ws/" + cep + "/json/", String.class);
        return response.getBody();
    }

    public List<Cliente> retornaTodosClientes(){

       // Collections.sort(tabelaClientes,(cliente1, cliente2) -> cliente1.getNome().compareTo(cliente2.getNome()));

        return tabelaClientes;
    }

    public List<Cliente> retornaTodosClientesClassificados(){

        Collections.sort(tabelaClientes);

        return tabelaClientes;
    }

    private String gerarId(){
       return UUID.randomUUID().toString();
    }

   public void delete (String id){

        for (int i = 0; i < tabelaClientes.size();i++) {

            Cliente cliente = tabelaClientes.get(i);

            if(cliente.getId().equals(id)){

                tabelaClientes.remove(cliente);
            }
        }
   }

    public void atualizar(Cliente clienteAtualizado) {

        for (int i = 0; i < tabelaClientes.size(); i++) {

            Cliente antigoCliente = tabelaClientes.get(i);

            if (antigoCliente.getId().equals(clienteAtualizado.getId())) {
                antigoCliente.setNome(clienteAtualizado.getNome());
                antigoCliente.setCidade(clienteAtualizado.getCidade());
                antigoCliente.setBairro(clienteAtualizado.getBairro());
                antigoCliente.setCep(clienteAtualizado.getCep());
                antigoCliente.setLogradouro(clienteAtualizado.getLogradouro());
                break;
            }
        }
    }

    public List<Cliente> clientePorId (String id){

        List<Cliente> clientesEncontrado = new ArrayList<>();

        for (int i = 0; i < tabelaClientes.size(); i++) {
            Cliente cliente = tabelaClientes.get(i);
            if (cliente.getId().equals(id)) {
                clientesEncontrado.add(cliente);
            }
        }
        return clientesEncontrado;
    }


}