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
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;
    private double valor_total;
    private OffsetDateTime data;

    @OneToMany(mappedBy = "pedido")
    private List<Produto_Pedido> produto_pedidos;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

}
