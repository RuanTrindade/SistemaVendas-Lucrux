package br.com.ruan.service.implementacao;


import br.com.ruan.componente.Usuario;
import br.com.ruan.repository.UsuarioRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Service
public class ImplementacaoUsuario implements UserDetailsService {

    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {



        Usuario usuario = usuarioRepository.findByEmail(email);

        if(usuario == null){
            throw new UsernameNotFoundException("Usuário não encontrado");
        }

        GrantedAuthority autoridade = new SimpleGrantedAuthority(
                usuario.getFuncao().toString()
        );

        Collection<GrantedAuthority> autoridades =
                Collections.singletonList(autoridade);

        return new org.springframework.security.core.userdetails.User(
                usuario.getEmail(), usuario.getSenha(), autoridades
        );

    }



}
