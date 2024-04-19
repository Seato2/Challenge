package services;


import entities.Fornecedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.FornecedorRepository;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor criarFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public List<Fornecedor> obterTodosFornecedores() {
        return fornecedorRepository.findAll();
    }

    public Fornecedor obterFornecedorPorId(Long fornecedorId) {
        return fornecedorRepository.findById(fornecedorId).orElse(null);
    }

    public Fornecedor atualizarFornecedor(Long fornecedorId, Fornecedor novoFornecedor) {
        Fornecedor fornecedorExistente = obterFornecedorPorId(fornecedorId);

        fornecedorExistente.setNome(novoFornecedor.getNome());
        fornecedorExistente.setEmail(novoFornecedor.getEmail());

        return fornecedorRepository.save(fornecedorExistente);
    }

    public void excluirFornecedor(Long fornecedorId) {
        Fornecedor fornecedor = obterFornecedorPorId(fornecedorId);
        fornecedorRepository.delete(fornecedor);
    }

}
