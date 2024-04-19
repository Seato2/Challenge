package services;

import entities.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto criarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }


    public List<Produto> obterTodosProdutos() {
        return produtoRepository.findAll();
    }

    public Produto obterProdutoPorId(Long produtoId) {
        return produtoRepository.findById(produtoId).orElse(null);
    }

    public Produto atualizarProduto(Long produtoId, Produto novoProduto) {
        Produto produtoExistente = obterProdutoPorId(produtoId);

        produtoExistente.setNome(novoProduto.getNome());
        produtoExistente.setPreco(novoProduto.getPreco());

        return produtoRepository.save(produtoExistente);
    }

    public void excluirProduto(Long produtoId) {
        Produto produto = obterProdutoPorId(produtoId);
        produtoRepository.delete(produto);
    }
}
