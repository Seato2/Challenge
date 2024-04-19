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
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long cnpj;
    private Long cpf;
    private String email;
    private Long telefone;
    private OffsetDateTime data_cadastro;


    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;




}
