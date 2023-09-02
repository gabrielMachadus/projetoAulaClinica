package br.com.diferpan.clinica.spring.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_autoridades")
public class Autoridade {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "autoridade")
    private String autoridade;

    @Override
    public String toString() {
        return "Autoridade{" +
                "id=" + id +
                ", autoridade='" + autoridade + '\'' +
                '}';
    }
}
