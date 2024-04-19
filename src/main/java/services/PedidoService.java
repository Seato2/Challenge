package services;

import entities.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.PedidoRepository;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;


    public Pedido criarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }


    public List<Pedido> obterTodosPedidos() {
        return pedidoRepository.findAll();
    }


    public Pedido obterPedidoPorId(Long pedidoId) {
        return pedidoRepository.findById(pedidoId).orElse(null);
    }


    public Pedido atualizarPedido(Long pedidoId, Pedido novoPedido) {
        Pedido pedidoExistente = obterPedidoPorId(pedidoId);
        pedidoExistente.setStatus(novoPedido.getStatus());

        return pedidoRepository.save(pedidoExistente);
    }


    public void excluirPedido(Long pedidoId) {
        Pedido pedido = obterPedidoPorId(pedidoId);
        pedidoRepository.delete(pedido);
    }
}
