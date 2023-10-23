API de Compras - Documentação
Fornecedores
Endpoint 1: /fornecedores

Verbo: GET
Descrição: Obtém a lista de fornecedores cadastrados.
Códigos de Status:
200 OK: A solicitação foi bem-sucedida e a lista de fornecedores foi retornada.
404 Not Found: Nenhum fornecedor cadastrado encontrado.
Endpoint 2: /fornecedores

Verbo: POST
Descrição: Cadastra um novo fornecedor.
Códigos de Status:
201 Created: Fornecedor cadastrado com sucesso.
400 Bad Request: Os dados fornecidos são inválidos.
Produtos/Serviços
Endpoint 3: /produtos

Verbo: GET
Descrição: Obtém a lista de produtos/serviços desejados.
Códigos de Status:
200 OK: A solicitação foi bem-sucedida e a lista de produtos/serviços foi retornada.
404 Not Found: Nenhum produto/serviço encontrado.
Endpoint 4: /produtos

Verbo: POST
Descrição: Adiciona um novo produto/serviço à lista de desejos.
Códigos de Status:
201 Created: Produto/serviço adicionado com sucesso.
400 Bad Request: Os dados fornecidos são inválidos.
Solicitações de Cotações
Endpoint 5: /cotas

Verbo: POST
Descrição: Cria uma nova solicitação de cotação.
Códigos de Status:
201 Created: Solicitação de cotação criada com sucesso.
400 Bad Request: Os dados fornecidos são inválidos.
Endpoint 6: /cotas/{id}

Verbo: GET
Descrição: Obtém os detalhes de uma solicitação de cotação específica com base em seu ID.
Códigos de Status:
200 OK: A solicitação foi bem-sucedida, e os detalhes da solicitação de cotação foram retornados.
404 Not Found: Solicitação de cotação não encontrada.
Endpoint 7: /cotas/enviar

Verbo: POST
Descrição: Envia automaticamente as solicitações de cotação aos fornecedores selecionados.
Códigos de Status:
200 OK: As solicitações de cotação foram enviadas com sucesso.
Cotações
Endpoint 8: /cotacoes/{id}

Verbo: GET
Descrição: Obtém os detalhes de uma cotação específica com base em seu ID.
Códigos de Status:
200 OK: A solicitação foi bem-sucedida, e os detalhes da cotação foram retornados.
404 Not Found: Cotação não encontrada.
Endpoint 9: /cotacoes/{id}/aprovar

Verbo: POST
Descrição: Permite a aprovação de uma cotação pelo usuário responsável.
Códigos de Status:
200 OK: Cotação aprovada com sucesso.
Pedidos de Compra
Endpoint 10: /pedidos

Verbo: POST
Descrição: Gera um novo pedido de compra com base nos detalhes da cotação aprovada.
Códigos de Status:
201 Created: Pedido de compra gerado com sucesso.
Acompanhamento de Pedidos
Endpoint 11: /pedidos/{id}

Verbo: GET
Descrição: Obtém os detalhes de um pedido de compra específico com base em seu ID.
Códigos de Status:
200 OK: A solicitação foi bem-sucedida, e os detalhes do pedido de compra foram retornados.
404 Not Found: Pedido de compra não encontrado.
Relatórios e Histórico
Endpoint 12: /relatorios

Verbo: GET
Descrição: Gera relatórios e histórico de transações.
Códigos de Status:
200 OK: Relatórios gerados com sucesso.