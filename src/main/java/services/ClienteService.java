package services;

import entities.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public Cliente criarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> obterTodosClientes() {
        return clienteRepository.findAll();
    }

    public Cliente obterClientePorId(Long clienteId) {
        return clienteRepository.findById(clienteId).orElse(null);
    }

    public Cliente atualizarCliente(Long clienteId, Cliente novoCliente) {
        Cliente clienteExistente = obterClientePorId(clienteId);
        clienteExistente.setEmail(novoCliente.getEmail());

        return clienteRepository.save(clienteExistente);
    }

    public void excluirCliente(Long clienteId) {
        Cliente cliente = obterClientePorId(clienteId);
        clienteRepository.delete(cliente);
    }
}


