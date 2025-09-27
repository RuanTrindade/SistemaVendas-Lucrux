package br.com.ruan.repository;

import br.com.ruan.componente.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    Usuario findByEmail(String email);


}
