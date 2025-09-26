package br.com.ruan.config;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Service
public class JwtFornecedor {

    static SecretKey senha = Keys.hmacShaKeyFor(JwtConstante.JWT_SECRETO.getBytes());

    public String gerarToken(Authentication autenticacao){

        Collection<? extends GrantedAuthority> permissoes =
                autenticacao.getAuthorities();

        String permissoesUsuario = gerarConjuntoPermissoes(permissoes);

        return Jwts.builder()
                .issuedAt(new Date())
                .expiration(new Date(new Date().getTime()+ 86400000))
                .claim("email",autenticacao.getName())
                .claim("authorities", permissoesUsuario)
                .signWith(senha)
                .compact();
    }


    public String getEmailFromToken(String token){
        token = token.substring(7);
        Claims dados = Jwts.parser()
                .verifyWith(senha)
                .build()
                .parseSignedClaims(token)
                .getPayload();

        return String.valueOf(dados.get("email"));
    }


    private String gerarConjuntoPermissoes(Collection<? extends GrantedAuthority> permissoes) {

        Set<String> conjuntoPermissoes = new HashSet<>();
        for(GrantedAuthority permissao : permissoes){
            conjuntoPermissoes.add(permissao.getAuthority());
        }

        return String.join(",", conjuntoPermissoes);
    }
}
