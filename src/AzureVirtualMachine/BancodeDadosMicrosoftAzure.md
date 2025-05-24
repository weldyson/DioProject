# Desafio DIO: Configurando uma Instância de Banco de Dados no Azure

Este repositório contém documentação prática sobre a criação e configuração de uma instância de banco de dados na plataforma Microsoft Azure. Ele serve como material de apoio para estudos e futuras implementações.

## Índice
1. [Introdução](#introdução)
2. [Pré-requisitos](#pré-requisitos)
3. [Passo a Passo](#passo-a-passo)
4. [Dicas e Boas Práticas](#dicas-e-boas-práticas)
5. [Referências](#referências)

---

## Introdução
Neste projeto, exploramos o processo de criação e configuração de uma instância de banco de dados no Azure. O objetivo é aplicar os conceitos aprendidos nas aulas e documentar a experiência de forma clara e organizada.

---

## Pré-requisitos
- Conta ativa no [Microsoft Azure](https://azure.microsoft.com/ ).
- Conhecimento básico de navegação no portal do Azure.
- Ferramentas instaladas:
    - Azure Data Studio ou SSMS (SQL Server Management Studio).

---

## Passo a Passo

### 1. Acessar o Portal do Azure
Faça login no [portal.azure.com](https://portal.azure.com ) com suas credenciais.

### 2. Criar uma Instância de Banco de Dados
- No menu lateral, clique em "Criar um recurso".
- Pesquise por "SQL Database" ou "Instância Gerenciada de SQL".
- Clique em "Criar".

### 3. Configurar a Instância
- Detalhes do Projeto:
    - Assinatura: Escolha sua assinatura ativa.
    - Grupo de Recursos: Crie um novo grupo (ex.: `grupo-dio`).
- Detalhes do Banco de Dados:
    - Nome da instância: `dio-sql-db`.
    - Região: Escolha uma região próxima (ex.: `East US`).
- Configurações do Servidor:
    - Crie um novo servidor ou use um existente.
    - Configure credenciais de administrador (nome de usuário e senha).
- Plano de Preços:
    - Escolha um plano adequado ao seu uso (ex.: "Basic" ou "Standard").

### 4. Configurar Rede e Segurança
- Abra as portas necessárias e configure regras de firewall para permitir acesso externo, se necessário.

### 5. Revisar e Criar
- Revise todas as configurações.
- Clique em "Criar" para provisionar a instância de banco de dados.

### 6. Testar a Conexão
- Use ferramentas como Azure Data Studio ou SSMS para testar a conexão.

---

## Dicas e Boas Práticas
- Sempre use senhas fortes para o administrador do banco de dados.
- Limite o acesso à instância configurando regras de firewall.
- Monitore os custos da instância no Azure para evitar cobranças inesperadas.

---

## Referências
- [Início Rápido: Criar Instância Gerenciada de SQL do Azure](https://learn.microsoft.com/pt-br/azure/azure-sql/managed-instance/instance-create-quickstart )
- [Documentação Oficial do GitHub](https://docs.github.com/ )