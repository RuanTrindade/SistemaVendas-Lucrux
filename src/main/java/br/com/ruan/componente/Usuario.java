package br.com.ruan.componente;


import br.com.ruan.dominio.FuncaoUsuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Usuario {

    @Id
    private Long id;

    @Column(nullable = false)
    private String nomeInteiro;

    @Column(nullable = false, unique = true)
    @Email(message = "O email deve ser válido")
    private String email;


    private String celular;

    @Column(nullable = false)
    private FuncaoUsuario funcao;


    @Column(nullable = false)
    private String senha;

    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;
    private LocalDateTime ultimoLogin;
}
