# ⚙️ Funcionalidades do Sistema de Gerenciamento de Ingressos

## 🎟️ 1. Gerenciamento de Ingressos
- Realizar **compra**, **reserva**, **cancelamento** e **validação** de ingressos.
- Aplicar **regras de preço** conforme o tipo do ingresso (VIP, Meia, Inteira).
- Controlar o **limite de compra por CPF**.
- Gerar o **histórico completo de compras** do usuário.
- Registrar todas as transações no banco de dados.

---

## 📅 2. Cadastro de Evento
- Cadastrar novos eventos com **data, local, capacidade e responsável**.
- Validar eventos para garantir que **não haja duplicidade de nome**.
- Atualizar ou excluir eventos existentes.
- Impedir cadastro de eventos com **data anterior ao dia atual**.

---

## 👥 3. Gestão de Usuário
- Cadastrar usuários comuns e administradores.
- Validar e-mails e senhas no momento do registro.
- Administradores podem **gerenciar eventos e relatórios**.
- Usuários comuns podem **comprar e reservar ingressos**.

---

## 📊 4. Histórico e Relatórios
- Exibir histórico de compras do usuário autenticado.
- Gerar relatórios de vendas por evento.
- Filtrar relatórios por data, tipo de ingresso e status da compra.
- Impedir geração de relatórios para **eventos cancelados**.

---

## 💡 5. Funcionalidades Internas
- Cálculo automático de preço final com descontos e taxas.
- Controle de limite de ingressos por CPF.
- Log interno de todas as operações realizadas.
- Comunicação entre módulos via **objetos Java**.
- Execução principal iniciada na classe `Main.java`.

---

## 🧱 Estrutura Técnica
O sistema é composto por módulos independentes que se comunicam por meio de objetos.  
Cada pacote é responsável por uma parte do sistema:

| Pacote | Responsabilidade |
|---------|------------------|
| `cadastroevento` | Criação e validação de eventos |
| `gerenciamentodeingressos` | Controle de ingressos e regras comerciais |
| `gestaodeusuario` | Controle de usuários e permissões |
| `historicoserelatorios` | Geração e exibição de relatórios |
| `main` | Execução e integração de todos os módulos |

---

## 🧠 Requisitos Gerais
- O sistema deve ser modular, reutilizável e de fácil manutenção.
- Deve seguir o padrão **orientado a objetos**, com encapsulamento e métodos bem definidos.
- Todas as classes devem conter comentários explicativos (`//`) indicando suas funções.
- Deve permitir evolução futura, como integração com banco de dados e interface gráfica.

---

# 📄 Histórico de Revisões
| Versão | Data       | Descrição                                                                                                                         | Autor                         |
|--|------------|-----------------------------------------------------------------------------------------------------------------------------------|-------------------------------|
| 1.0 | 26/10/2025 | Desenvolvimento estrutural do projeto, Criação de novas pastas e README, Criação de novos arquivos e implementação nas java class | Gabriel Almeida Dantas Fontes |
|  | 27/10/2025 | Organizando o README e atualizando a main                                                                                         | Gabriel Almeida Dantas Fontes |
|  | 28/10/2025 | Criando e ajustando cadastro ADM e cadastro comum                                                                                 | Gustavo Miguel                |
|  | 03/11/2025 | Repositório para persistir dados                                                                                                  | Gabriel Almeida Dantas Fontes |
|  | 26/10/2025 | Criando Ingressos.json                                                                                                            | Gabriel Almeida Dantas Fontes |