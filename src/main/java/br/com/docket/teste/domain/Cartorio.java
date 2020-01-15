package br.com.docket.teste.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "cartorios")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cartorio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;

}
