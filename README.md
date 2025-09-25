
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



