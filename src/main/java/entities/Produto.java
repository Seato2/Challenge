package entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private double preco;
    private OffsetDateTime data_atualizacao;
    private int quantidade_estoque;
    private OffsetDateTime data_criacao_produto;

    @ManyToOne
    @JoinColumn(name = "cnpj")
    private Fornecedor fornecedor;

    @OneToMany(mappedBy = "produto")
    private List<Produto_Pedido> produto_pedidos;

}
