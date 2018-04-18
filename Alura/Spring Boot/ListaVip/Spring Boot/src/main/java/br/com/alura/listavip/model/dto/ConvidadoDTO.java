package br.com.alura.listavip.model.dto;



import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;

@Getter
@Setter
public class ConvidadoDTO implements Serializable {

    private Long id;

    private String nome;

    private String email;

    private String telefone;
}
