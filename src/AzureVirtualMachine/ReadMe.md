# Desafio DIO: Criando e Configurando uma Máquina Virtual no Azure

Este repositório contém documentação prática sobre a criação e configuração de uma máquina virtual na plataforma Microsoft Azure. Ele serve como material de apoio para estudos e futuras implementações.

## Índice
1. [Introdução](#introdução)
2. [Pré-requisitos](#pré-requisitos)
3. [Passo a Passo](#passo-a-passo)
4. [Dicas e Boas Práticas](#dicas-e-boas-práticas)
5. [Referências](#referências)

---

## Introdução
Neste projeto, exploramos o processo de criação e configuração de uma máquina virtual no Azure. O objetivo é aplicar os conceitos aprendidos nas aulas e documentar a experiência de forma clara e organizada.

---

## Pré-requisitos
- Conta ativa no [Microsoft Azure](https://azure.microsoft.com/ ).
- Conhecimento básico de navegação no portal do Azure.
- Ferramentas instaladas:
    - Cliente SSH (para Linux) ou RDP (para Windows).
    - Git e GitHub configurados localmente.

---

## Passo a Passo

### 1. Acessar o Portal do Azure
Faça login no [portal.azure.com](https://portal.azure.com ) com suas credenciais.

### 2. Criar uma Máquina Virtual
- No menu lateral, clique em "Criar um recurso".
- Selecione "Máquina Virtual".
- Escolha o sistema operacional (ex.: Ubuntu Linux ou Windows Server).
- Configure os detalhes da máquina:
    - Nome: `dio-vm`
    - Região: `East US`
    - Tipo de VM: `Standard B1s`
- Defina credenciais de acesso (nome de usuário e senha ou chave SSH).

### 3. Configurar Rede e Armazenamento
- Abra as portas necessárias (ex.: porta 22 para SSH ou porta 3389 para RDP).
- Escolha o tipo de armazenamento para os discos.

### 4. Revisar e Criar
- Revise todas as configurações.
- Clique em "Criar" para provisionar a máquina virtual.

### 5. Conectar-se à Máquina Virtual
- Para Linux: Use o comando `ssh usuario@ip-da-vm`.
- Para Windows: Use o cliente RDP para conectar-se ao IP da VM.

---

## Dicas e Boas Práticas
- Sempre use senhas fortes ou chaves SSH seguras.
- Limite o acesso à máquina virtual configurando regras de firewall.
- Monitore os custos da VM no Azure para evitar cobranças inesperadas.

---

## Referências
- [Início Rápido: Criar uma máquina virtual do Windows no Portal do Azure](https://learn.microsoft.com/pt-br/azure/virtual-machines/windows/quick-create-portal )
- [Documentação Oficial do GitHub](https://docs.github.com/ )