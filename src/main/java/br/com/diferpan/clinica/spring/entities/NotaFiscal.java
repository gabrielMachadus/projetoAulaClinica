package br.com.diferpan.clinica.spring.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_notas_fiscais")
public class NotaFiscal {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double valor;

    @Column(name = "data_emissao")
    private Instant dataEmissao;

    @OneToOne
    @JoinColumn(name = "id_consulta")
    private Consulta consulta;

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "id=" + id +
                ", valor=" + valor +
                ", dataEmissao=" + dataEmissao +
                ", consulta=" + consulta +
                '}';
    }
}
