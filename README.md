
  <h1>SistemaVendas-Lucrux</h1>
  <p>
    <img src="https://img.shields.io/badge/status-em%20desenvolvimento-yellow" alt="Status"/>
    <img src="https://img.shields.io/badge/Tech-React%20|%20SpringBoot%20|%20MySQL-blue" alt="Tecnologias"/>
  </p>


Irei construir uma plataforma de ponto de venda pronta para produção para shoppings, supermercados e redes de varejo usando **React**, **Spring Boot** e **MySQL**.

---

## 📌 Sobre o projeto

> Este é um projeto prático para criar um poderoso sistema de ponto de venda (PDV) do zero.  
> Não é apenas mais um miniprojeto — é um aplicativo empresarial completo, projetado para plataformas **multilocação**.

**Principais funcionalidades que o sistema terá:**
- 💳 Terminais de caixa  
- 🏪 Painéis de agência  
- 🏬 Painéis de loja  
- 🌐 Recursos de superadministração  

O projeto **vai impulsionar meu currículo**, me preparar para entrevistas e proporcionar experiência prática completa com as tecnologias que as principais empresas usam.

---

## 🛠 Tecnologias que vou utilizar

| Camada       | Tecnologias |
| ------------ | ----------- |
| **Frontend** | React, Shadcn UI, Tailwind CSS, Redux Toolkit, Formik, Yup, Recharts |
| **Backend**  | Spring Boot (Java), APIs REST, JPA/Hibernate |
| **Banco**    | MySQL |
| **Segurança**| Autenticação JWT, Controle de Acesso Baseado em Funções |
| **Integrações** | Razorpay, Stripe, Cloudinary, Axios |

---

## ⚡ Recursos que vou criar

### 👨‍💼 Terminal de Caixa
- Processar pedidos e pagamentos  
- Histórico de pedidos  
- Reembolsos  
- Relatórios de turno  

### 🏪 Painel da Agência
- Gerenciar inventário de filial  
- Rastrear pedidos, vendas e reembolsos  
- Gerenciar funcionários e clientes  

### 🏬 Painel da Loja
- Gerenciar várias filiais  
- Gestão de produtos e funcionários  
- Relatórios e alertas de vendas  

### 🌐 Super Admin
- Gerenciar todas as lojas e filiais  
- Controle de acesso e permissões  
- Monitorar toda a plataforma  

---

## 🎯 Por que farei este projeto?

- ✅ Aprender a construir um produto real do zero  
- ✅ Ganhar experiência prática para o currículo  
- ✅ Dominar o fluxo full-stack **React + Spring Boot + MySQL**  
- ✅ Entender a arquitetura de aplicativos corporativos e multilocatários  
- ✅ Criar painéis para caixas, gerentes de filiais, proprietários de lojas e superadministradores  
- ✅ Integrar pagamentos, relatórios, estoque e segurança  
- ✅ Dar um passo mais perto de se tornar um desenvolvedor full-stack pronto para o trabalho  

---

## 👤 Público-alvo
- Alunos que desejam adicionar projetos fortes ao currículo  
- Desenvolvedores full-stack que querem praticar desenvolvimento SaaS  
- Candidatos a emprego se preparando para entrevistas com projetos reais  
- Desenvolvedores que desejam criar aplicativos de nível empresarial  

---

## 🎓 Resultado esperado
- Um sistema de ponto de venda totalmente funcional e pronto para implantação  
- Um projeto full-stack de nível de produção para mostrar  
- A confiança para criar meus próprios aplicativos de nível empresarial no futuro  

---

## ⚠ Observação

Irei **modificar o sistema constantemente**, adicionando melhorias e fazendo **muitos commits** para registrar cada evolução do projeto.


---




## 🚀 Inicialização do Projeto

O projeto **Lucrux** (RuanSistemaVendas) foi criado utilizando o **Spring Initializr** com as seguintes configurações:

- **Java:** 21  
- **Gerenciador de Dependências:** Maven  
- **Grupo (Group):** `br.com.ruan`  
- **Artefato (Artifact):** `RuanSistemaVendas`  
- **Nome do Projeto:** `RuanSistemaVendas`  
- **Descrição:** Sistema de vendas Lucrux  
- **Pacote Base:** `br.com.ruan`  
- **Versão do Spring Boot:** 3.5.6 *(ou a que estiver utilizando)*  
- **Empacotamento:** Jar  
- **Dependências iniciais:** 


## ⚙️ Configuração do Projeto & Dependências

> ⚠️ **Aviso:** Nem todas as dependências listadas estão disponíveis diretamente no Spring Initializr. Algumas precisarão ser adicionadas manualmente ao arquivo `pom.xml` ou pesquisadas para integração no projeto.

### 🔹 Spring Boot Starters

| Dependência | Descrição |
| --- | --- |
| `spring-boot-starter-data-jpa` | Suporte para trabalhar com bancos de dados usando JPA & Hibernate. |
| `spring-boot-starter-security` | Habilita Spring Security para login, perfis de usuário e autenticação. |
| `spring-boot-starter-web` | Necessário para criar APIs RESTful usando Spring MVC. |
| `spring-boot-starter-validation` | Habilita validação de requisições com anotações como `@NotNull`, `@Email`, etc. |
| `spring-boot-starter-mail` | Permite enviar notificações por e-mail (ex.: confirmação, recibos). |



### 🧪 Dependências para Testes

| Dependência | Descrição |
| --- | --- |
| `spring-boot-starter-test` | Inclui JUnit, Mockito e Spring Test para testes unitários e de integração. |
| `spring-security-test` | Permite testar endpoints seguros (autenticação e autorização). |



### 🛠️ Ferramentas de Desenvolvimento

| Dependência | Descrição |
| --- | --- |
| `spring-boot-devtools` | Reinicia automaticamente o servidor ao alterar o código (útil no desenvolvimento). |
| `lombok` | Reduz código repetitivo gerando getters, setters, construtores, etc. (usando `@Getter`, `@Setter`, etc.) |



### 🗄️ Banco de Dados

| Dependência | Descrição |
| --- | --- |
| `mysql-connector-j` | Driver JDBC para conectar a aplicação Spring Boot ao MySQL. |



### 🔐 JWT (JSON Web Token)

| Dependência | Descrição |
| --- | --- |
| `jjwt-api` | API principal para criar e validar tokens JWT. |
| `jjwt-impl` | Implementação runtime do JWT (necessário para assinatura de tokens). |
| `jjwt-jackson` | Integra JWT com Jackson para parsing JSON do payload. |



### 💳 Gateways de Pagamento

| Dependência | Descrição |
| --- | --- |
| `razorpay-java` | SDK Java para integrar pagamentos Razorpay. |
| `stripe-java` | SDK Java para integrar pagamentos Stripe. |



### 🛠️ Plugin de Build (Maven)

| Plugin | Descrição |
| --- | --- |
| `spring-boot-maven-plugin` | Plugin Maven usado para empacotar e executar aplicações Spring Boot de forma simplificada. |


---


## 📦 Pom.xml completo

Adicione este conteúdo no seu arquivo **pom.xml**:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.5.6</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>br.com.ruan</groupId>
	<artifactId>ruan-sistema-vendas</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>ruan-sistema-vendas</name>
	<description>Sistema de Vendas para negócios online</description>
	<url/>
	<licenses>
		<license/>
	</licenses>
	<developers>
		<developer/>
	</developers>
	<scm>
		<connection/>
		<developerConnection/>
		<tag/>
		<url/>
	</scm>
	<properties>
		<java.version>21</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-mail</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>

        <!-- https://mvnrepository.com/artifact/com.razorpay/razorpay-java -->
        <dependency>
            <groupId>com.razorpay</groupId>
            <artifactId>razorpay-java</artifactId>
            <version>1.4.8</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.stripe/stripe-java -->
        <dependency>
            <groupId>com.stripe</groupId>
            <artifactId>stripe-java</artifactId>
            <version>28.3.1</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt -->
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt</artifactId>
            <version>0.12.6</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-impl -->
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-impl</artifactId>
            <version>0.12.6</version>
            <scope>runtime</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-jackson -->
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-jackson</artifactId>
            <version>0.12.6</version>
            <scope>runtime</scope>
        </dependency>


		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-test</artifactId>
			<scope>test</scope>
		</dependency>



	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>
````
> ⚠️ Observação: algumas dependências (razorpay-java, stripe-java, jjwt) precisam ser adicionadas manualmente, pois não aparecem no Spring Initializr.


---


## 📌 Configurações do application.properties

Estas configurações são para rodar o sistema **localmente** usando MySQL 8.4 na porta `3307`. 

```properties
# Nome do aplicativo
spring.application.name=ruan-sistema-vendas

# Porta do servidor
server.port=5000

# Configurações JPA/Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Configurações do banco de dados
spring.datasource.url=jdbc:mysql://localhost:3307/lucrux
spring.datasource.username=root
spring.datasource.password=1910
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
````
> ⚠️ Lembre-se de ajustar a senha e o nome do banco se estiver diferente na sua máquina. Assim como padrão é o MySQL rodar na porta `3306`, mas no meu caso estava dando como ocupada ai troquei para `3307`.


---

# 🔒 Configuração de Segurança do Sistema


### 🔐 SecurityConfig.java
**Caminho:** `src/main/java/br/com/ruan/config/SecurityConfig.java`

```java
package br.com.ruan.config;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import java.util.Arrays;
import java.util.Collections;

@Configuration
public class SecurityConfig {


    @Bean
    public SecurityFilterChain segurancaSistema(HttpSecurity seguranca) throws Exception {


        return seguranca
                .sessionManagement(sessao ->
                        sessao.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(autorizacao ->
                        autorizacao.requestMatchers("/api/**").authenticated()
                                .requestMatchers("/api/super-admin/**")
                                .hasRole("ADMIN")
                                .anyRequest().permitAll()
                ).addFilterBefore(new JwtValidar(),
                        BasicAuthenticationFilter.class)
                .csrf(AbstractHttpConfigurer::disable)
                .cors(
                        cors -> cors.configurationSource(corsConfigrationSource())
                ).build();


    }


    private CorsConfigurationSource corsConfigrationSource() {
        return new CorsConfigurationSource() {
            @Override
            public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
                CorsConfiguration cfg = new CorsConfiguration();
                cfg.setAllowedOrigins(
                        Arrays.asList(
                                "http://localhost:5173",
                                "http://localhost:3000"
                        )

                );
                cfg.setAllowedMethods(Collections.singletonList("*"));
                cfg.setAllowCredentials(true);
                cfg.setAllowedHeaders(Collections.singletonList("*"));
                cfg.setExposedHeaders(Arrays.asList("Authorization"));
                cfg.setMaxAge(3600L);
                return cfg;
            }
        };
    }
}
````

> Classe central de configuração de segurança do sistema.  
Responsável por:
>
> - Definir a política de sessões (`STATELESS`) para REST APIs.
> - Configurar autorização de endpoints:
>  - `/api/**` → autenticado
>  - `/api/super-admin/**` → apenas ADMIN
>  - demais → permitidos a todos
> - Adicionar o filtro de validação de JWT (`JwtValidar`) antes da autenticação básica.
> - Configurar CSRF (desabilitado) e CORS com origens, métodos e headers permitidos.
> - Expor o header `"Authorization"` para o frontend.


---


### 🛡️ JwtValidar.java
**Caminho:** `src/main/java/br/com/ruan/config/JwtValidar.java`

```java
package br.com.ruan.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
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

                SecurityContextHolder.getContext().setAuthentication(autenticacao);
            } catch (Exception erro){
                throw new BadCredentialsException("Token JWT inválido");
            }
        }

        filterChain.doFilter(request, response);
    }
}
````

> Descrição:
> Filtro de validação de JWT para o sistema.
> Responsável por:
>
> Capturar o token JWT do header "Authorization" (Bearer).
>
> Validar o token utilizando a chave secreta (JWT_SECRETO).
>
> Extrair informações de:
>
> "email" → email do usuário
>
> "authorities" → permissões/roles do usuário
>
> Criar uma autenticação (UsernamePasswordAuthenticationToken) e inserir no contexto de segurança.
>
> Lançar BadCredentialsException caso o token seja inválido.

---


### 🔑 JwtConstante.java

**Caminho:** `src/main/java/br/com/ruan/config/JwtConstante.java`

````java
package br.com.ruan.config;

public class JwtConstante {
    public static final String JWT_SECRETO = "minhaChaveSecretaSuperSegura1234567890";
    public static final String JWT_HEADER = "Authorization";
}

````
> Descrição:
> Classe de constantes do JWT para o sistema.
> Responsável por:
>
> Armazenar a chave secreta (JWT_SECRETO) utilizada para gerar e validar tokens JWT.
>
> Definir o nome do header HTTP (Authorization) que contém o token JWT.

---


### 🏭 JwtFornecedor.java

**Caminho:** `src/main/java/br/com/ruan/config/JwtFornecedor.java`

```java
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
````

> Descrição:
> Serviço responsável por gerar e manipular tokens JWT para o sistema.
> Responsável por:
>
> - Gerar token JWT contendo:
>   - "email" → email do usuário
>   - "authorities" → permissões/roles do usuário
>   - Data de emissão (issuedAt) e expiração (expiration)
> - Utilizar a chave secreta (JWT_SECRETO) para assinatura do token.
> - Extrair o email do usuário a partir de um token JWT.
> - Converter permissões do usuário em uma string separada por vírgula para inclusão no token.


---

# 👥 Estrutura de Usuários do Sistema

### 👤 Usuario.java

**Caminho:** `src/main/java/br/com/ruan/componente/Usuario.java`

````java
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
````

> Descrição:
> Entidade que representa um usuário do sistema.
> Responsável por armazenar:
>
> • id → Identificador único
> 
> • nomeInteiro → Nome completo do usuário
> 
> • email → Único e validado com anotação @Email
> 
> • celular → Contato opcional
> 
> • funcao → Enum FuncaoUsuario indicando o papel do usuário
> 
> • senha → Senha armazenada (criptografada posteriormente)
> 
> • criadoEm, atualizadoEm, ultimoLogin → Datas de auditoria


---


### 🏷️ FuncaoUsuario.java

**Caminho:** `src/main/java/br/com/ruan/dominio/FuncaoUsuario.java`

````java
package br.com.ruan.dominio;

public enum FuncaoUsuario {

    USUARIO,
    ADMINISTRADOR,
    CAIXA,
    GERENTE_FILIAL,
    GERENTE_LOJA

}
````

> Descrição:
> Enum que representa os papéis/funções de um usuário no sistema.
> Responsável por definir os tipos de usuários que podem existir:
>
> • USUARIO → Usuário comum do sistema
> 
> • ADMINISTRADOR → Usuário com permissões administrativas
>
> • CAIXA → Usuário responsável por operações de caixa
>
> • GERENTE_FILIAL → Gerente de filial, com permissões específicas da filial
>
> • GERENTE_LOJA → Gerente da loja, com permissões abrangentes sobre a loja


---


### 📦 UsuarioRepository.java

**Caminho:** `src/main/java/br/com/ruan/repository/UsuarioRepository.java`
````java
package br.com.ruan.repository;

import br.com.ruan.componente.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByEmail(String email);

}
````

> Descrição:
> Interface de repositório para a entidade Usuario.
> Responsável por:
> 
> • Estender JpaRepository para fornecer operações CRUD automaticamente.
>
> • Definir método findByEmail(String email) para buscar usuários pelo email, permitindo autenticação e consultas personalizadas.

---


### 👤 ImplementacaoUsuario.java

**Caminho:** `src/main/java/br/com/ruan/service/implementacao/ImplementacaoUsuario.java`
````java
package br.com.ruan.service.implementacao;

import br.com.ruan.componente.Usuario;
import br.com.ruan.repository.UsuarioRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

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
````

> Descrição:
> Classe de serviço que implementa UserDetailsService do Spring Security.
> Responsável por:
>
> • Buscar um usuário pelo email via UsuarioRepository.
>
> • Lançar UsernameNotFoundException caso o usuário não exista.
>
> • Criar um objeto GrantedAuthority com base na função do usuário (FuncaoUsuario).
> 
> • Retornar um UserDetails do Spring Security com email, senha e autoridades do usuário para autenticação.
