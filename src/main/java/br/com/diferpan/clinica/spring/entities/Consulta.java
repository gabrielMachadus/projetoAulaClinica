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
@Table(name = "tb_consultas")
public class Consulta {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_cadastro")
    private Instant dataCadastro;

    @Column(name = "data_atendimento")
    private Instant dataAtendimento;

    private Double taxa;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_medico")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "id_convenio")
    private Convenio convenio;

    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionario funcionario;

    @OneToOne(mappedBy = "consulta")
    private NotaFiscal notaFiscal;

    @Override
    public String toString() {
        return "Consulta{" +
                "id=" + id +
                ", dataCadastro=" + dataCadastro +
                ", dataAtendimento=" + dataAtendimento +
                ", taxa=" + taxa +
                ", paciente=" + paciente +
                ", medico=" + medico +
                ", convenio=" + convenio +
                ", funcionario=" + funcionario +
                '}';
    }
}
