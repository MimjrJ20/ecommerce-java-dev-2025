# Ecommerce Java Dev 2025

# E-commerce de Board Games e Jogos de Console

Este projeto é um e-commerce desenvolvido em **Java** e **JavaScript**, fruto de estudos em desenvolvimento web e boas práticas de arquitetura de software.
O objetivo é criar uma loja virtual que una dois mundos: os **board games** e os **jogos eletrônicos de console**.

---

## Objetivo e mercado
O sistema é voltado para pessoas que gostam tanto de jogos de tabuleiro quanto de jogos eletrônicos, oferecendo um espaço único onde os dois tipos de produtos convivem.

### Por que juntar board games e jogos de console?
Muitos fãs de jogos, seja de tabuleiro ou de console, têm algo em comum: **querem se divertir, se conectar com amigos e descobrir novas experiências de entretenimento**. Este e-commerce reúne esses dois mundos em um só lugar, oferecendo **comodidade, variedade e praticidade** para quem gosta de jogar.

Com isso, o cliente não precisa procurar em várias lojas, consegue ver **descrições detalhadas, preços e vídeos de review** antes de decidir a compra, e encontra produtos para diferentes estilos de jogo. Além disso, o sistema facilita a compra com **cadastro rápido, checkout seguro, integração de endereços e validação de documentos**.

Este projeto é, portanto, um **hub de entretenimento** pensado para quem gosta de jogar, seja no tabuleiro ou no console.

---

## Portais do sistema

### Portal do Cliente
- Navegação livre: o usuário pode visualizar produtos, categorias, preços, descrições e vídeos de review sem estar logado.
- Checkout: para efetuar a compra, é necessário criar uma conta ou fazer login.
- Segurança: as senhas de usuários serão armazenadas de forma criptografada no banco de dados, garantindo proteção contra acesso indevido.
- Validações: CPF e CNPJ são verificados antes da finalização da compra.
- Integrações: API ViaCEP para consulta automática de endereços.

### Portal do Colaborador
- Cadastro de itens: inserção de novos produtos, preços, categorias e descrições.
- Relatórios: acompanhamento de vendas, estoque e desempenho.
- Fornecedores: módulo específico para gerenciar entradas de fornecedores.
- Gestão administrativa: abas dedicadas para manutenção de dados internos.

---

## Tecnologias utilizadas
- **Backend:** Java + Maven
- **Frontend:** Frameworks JavaScript (a definir: React, Angular ou Vue)
- **Banco de Dados:** MySQL

### Integrações externas
- ViaCEP (consulta de endereços)

### Testes
- Testes automatizados planejados para garantir qualidade do código e confiabilidade do sistema.

---

## Arquitetura e Design Patterns

O sistema seguirá o padrão **MVC (Model-View-Controller)**, garantindo separação clara entre regras de negócio, apresentação e controle.

### Design Patterns aplicados
- **Repository Pattern:** abstração do acesso a dados, facilitando manutenção e testes.
- **Factory:** padronização na criação de objetos complexos.
- **Singleton:** utilizado para serviços globais como logging e cache.
- **DTOs (Data Transfer Objects):** para transportar dados entre camadas sem expor diretamente as entidades.

---

## Funcionalidades planejadas
- Autenticação e autorização de usuários com senhas criptografadas.
- Catálogo de produtos com categorias distintas (board games e jogos de console).
- Exibição de vídeos e resenhas de produtos.
- Carrinho de compras e fluxo de pedidos.
- Cadastro de colaboradores e fornecedores.
- Relatórios administrativos.
- Validações de CPF e CNPJ.
