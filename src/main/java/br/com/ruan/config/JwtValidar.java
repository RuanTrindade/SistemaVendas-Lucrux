package br.com.ruan.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.crypto.SecretKey;
import java.io.IOException;
import java.util.List;

public class JwtValidar extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain) throws ServletException, IOException {


        String token = request.getHeader(JwtConstante.JWT_HEADER);

        // Token JWT de acesso

        if(token != null){
            token = token.substring(7);

            try{
                SecretKey senha = Keys.hmacShaKeyFor(JwtConstante.JWT_SECRETO.getBytes());
                Claims dados = Jwts.parser()
                        .verifyWith(senha)
                        .build()
                        .parseSignedClaims(token)
                        .getPayload();

                String email = String.valueOf(dados.get("email"));
                String permissoes = String.valueOf(dados.get("authorities"));

                List<GrantedAuthority> permissoesDoUsuario = AuthorityUtils.commaSeparatedStringToAuthorityList(
                        permissoes
                );

                Authentication autenticacao = new UsernamePasswordAuthenticationToken(
                        email, null, permissoesDoUsuario
                );

                SecurityContextHolder.getContext().setAuthentication(
                        autenticacao
                );
            }

            catch (Exception erro){
                throw new BadCredentialsException("Token JWT inválido");
            }
        }


        filterChain.doFilter(request, response);



    }
}
