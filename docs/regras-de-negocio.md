# 🧩 Regras de Negócio do Sistema de Gerenciamento de Ingressos

## 🎟️ 1. Módulo de Gerenciamento de Ingressos (`gerenciamentodeingressos`)

### CompraDeIngresso
- Um cliente pode comprar **no máximo 4 ingressos por CPF**.
- Ingressos com **meia entrada** pagam **50% do valor base**.
- Ingressos do tipo **VIP** possuem **taxa adicional de 20%**.
- O sistema deve impedir compras se o evento estiver **esgotado**.

### ReservaDeIngresso
- A reserva expira após **15 minutos** sem pagamento.
- Reservas só podem ser feitas se **ainda houver vagas disponíveis**.

### CancelamentoDeIngresso
- Cancelamentos são permitidos até **24 horas antes do evento**.
- O valor devolvido é **80% do valor pago**, descontando taxas administrativas.

### ValidacaoDeIngressos
- O ingresso só é válido se **o pagamento estiver confirmado**.
- Cada ingresso possui um **código único** para validação na entrada.

### HistoricoDeCompras
- Todo ingresso comprado deve ser registrado no histórico do usuário.
- O histórico deve mostrar **data, tipo e valor da compra**.

---

## 📅 2. Módulo de Cadastro de Evento (`cadastroevento`)

### CadastrarEvento
- Eventos **não podem ter data no passado**.
- O **nome do evento deve ser único** no sistema.
- Cada evento deve conter **capacidade máxima e local definidos**.
- O responsável pelo evento deve ser um **usuário administrador**.

---

## 👤 3. Módulo de Gestão de Usuário (`gestaodeusuario`)

### CadastroComum
- Usuários comuns podem comprar ingressos, mas **não podem criar eventos**.
- O **email deve conter "@"** e a senha deve ter **mínimo de 6 caracteres**.

### CadastroAdministrador
- Usuários administradores têm **acesso total** ao sistema.
- Podem cadastrar eventos, editar informações e visualizar relatórios.

---

## 📊 4. Módulo de Histórico e Relatórios (`historicoserelatorios`)

### RelatorioDeVendasEvento
- Relatórios de vendas só podem ser gerados **após o término do evento**.
- Eventos cancelados **não aparecem** no relatório.

### ExibicaoDeHistoricoCompra
- O histórico exibido deve conter **apenas compras confirmadas**.
- O usuário comum só pode visualizar **suas próprias compras**.

---

## 🧠 5. Funcionalidades Gerais do Sistema

- O sistema deve calcular automaticamente o **valor final do ingresso**.
- Cada operação (compra, cancelamento, reserva) deve ser **registrada em log**.
- Todos os módulos devem se comunicar via **objetos Java**, mantendo encapsulamento.
- O método `main()` coordena todos os módulos e executa o fluxo principal.  