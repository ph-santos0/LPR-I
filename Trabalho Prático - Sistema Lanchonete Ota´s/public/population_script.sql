-- Populando a tabela Funcionário
INSERT INTO Funcionario (ID, Nome, Senha, Cargo, Data_Criada, Data_Atualizada) VALUES
(1, 'Fabio', '123456', 'admin', CURDATE(), CURDATE()),
(2, 'Pedro', '1234567', 'admin', CURDATE(), CURDATE()),
(3, 'Joao', '12345678', 'user', CURDATE(), CURDATE()); 

-- Populando a tabela UF
INSERT INTO UF (Codigo, Sigla) VALUES (1, 'SP');
INSERT INTO UF (Codigo, Sigla) VALUES (2, 'RJ');
INSERT INTO UF (Codigo, Sigla) VALUES (3, 'MG');
INSERT INTO UF (Codigo, Sigla) VALUES (4, 'RS');
INSERT INTO UF (Codigo, Sigla) VALUES (5, 'BA');

-- Populando a tabela Fornecedor
INSERT INTO Fornecedor (CNPJ, Nome, Tel_Fixo, Tel_Celular, Cidade, Bairro, Numero, Rua, CEP, Sigla_UF) 
VALUES ('12345678000101', 'Lanches Dona Vilma', '1123456789', '11987654321', 'São Paulo', 'Centro', 100, 'Rua A', '01000-000', 'SP');
INSERT INTO Fornecedor (CNPJ, Nome, Tel_Fixo, Tel_Celular, Cidade, Bairro, Numero, Rua, CEP, Sigla_UF) 
VALUES ('22345678000101', 'B&B Bebidas', '2134567890', '21987654322', 'Rio de Janeiro', 'Zona Sul', 200, 'Rua B', '20000-000', 'RJ');
INSERT INTO Fornecedor (CNPJ, Nome, Tel_Fixo, Tel_Celular, Cidade, Bairro, Numero, Rua, CEP, Sigla_UF) 
VALUES ('32345678000101', 'Q-Doçura', '3134567890', '31987654323', 'Belo Horizonte', 'Savassi', 300, 'Rua C', '30000-000', 'MG');
INSERT INTO Fornecedor (CNPJ, Nome, Tel_Fixo, Tel_Celular, Cidade, Bairro, Numero, Rua, CEP, Sigla_UF) 
VALUES ('42345678000101', 'Distribuidora Pacheco e Festa', '4134567890', '41987654324', 'Porto Alegre', 'Moinhos', 400, 'Rua D', '40000-000', 'RS');
INSERT INTO Fornecedor (CNPJ, Nome, Tel_Fixo, Tel_Celular, Cidade, Bairro, Numero, Rua, CEP, Sigla_UF) 
VALUES ('52345678000101', 'Magia Distribuidora', '5134567890', '51987654325', 'Salvador', 'Pelourinho', 500, 'Rua E', '50000-000', 'BA');

-- Populando a tabela Cliente
INSERT INTO Cliente (CPF, Nome, Tel_Fixo, Tel_Celular, Cidade, Bairro, Numero, Rua, CEP, Sigla_UF) 
VALUES ('12345678901', 'João Silva', '1123456788', '11987654326', 'São Paulo', 'Centro', 101, 'Rua F', '01001-000', 'SP');
INSERT INTO Cliente (CPF, Nome, Tel_Fixo, Tel_Celular, Cidade, Bairro, Numero, Rua, CEP, Sigla_UF) 
VALUES ('22345678901', 'Maria Oliveira', '2134567891', '21987654327', 'Rio de Janeiro', 'Zona Norte', 201, 'Rua G', '20001-000', 'RJ');
INSERT INTO Cliente (CPF, Nome, Tel_Fixo, Tel_Celular, Cidade, Bairro, Numero, Rua, CEP, Sigla_UF) 
VALUES ('32345678901', 'Carlos Almeida', '3134567892', '31987654328', 'Belo Horizonte', 'Centro', 301, 'Rua H', '30001-000', 'MG');
INSERT INTO Cliente (CPF, Nome, Tel_Fixo, Tel_Celular, Cidade, Bairro, Numero, Rua, CEP, Sigla_UF) 
VALUES ('42345678901', 'Ana Costa', '4134567893', '41987654329', 'Porto Alegre', 'Zona Leste', 401, 'Rua I', '40001-000', 'RS');
INSERT INTO Cliente (CPF, Nome, Tel_Fixo, Tel_Celular, Cidade, Bairro, Numero, Rua, CEP, Sigla_UF) 
VALUES ('52345678901', 'Pedro Souza', '5134567894', '51987654330', 'Salvador', 'Barra', 501, 'Rua J', '50001-000', 'BA');

-- Populando a tabela Produto
INSERT INTO Produto (Codigo, Nome, Estoque, Valor, Imposto, Unidade) 
VALUES (1, 'Refrigerante', 100, 5.50, 10.00, 'Unidade');
INSERT INTO Produto (Codigo, Nome, Estoque, Valor, Imposto, Unidade) 
VALUES (2, 'Salgado', 200, 3.00, 5.00, 'Unidade');
INSERT INTO Produto (Codigo, Nome, Estoque, Valor, Imposto, Unidade) 
VALUES (3, 'Chocolate', 150, 7.00, 15.00, 'Unidade');
INSERT INTO Produto (Codigo, Nome, Estoque, Valor, Imposto, Unidade) 
VALUES (4, 'Cerveja', 300, 4.50, 8.00, 'Unidade');
INSERT INTO Produto (Codigo, Nome, Estoque, Valor, Imposto, Unidade) 
VALUES (5, 'Bolo', 50, 20.00, 18.00, 'Unidade');

-- Populando a tabela Forma_Pagamento
INSERT INTO Forma_Pagamento (Codigo, Tipo) VALUES (1, 'Cartão de Crédito');
INSERT INTO Forma_Pagamento (Codigo, Tipo) VALUES (2, 'Cartão de Débito');
INSERT INTO Forma_Pagamento (Codigo, Tipo) VALUES (3, 'Dinheiro');
INSERT INTO Forma_Pagamento (Codigo, Tipo) VALUES (4, 'Pix');
INSERT INTO Forma_Pagamento (Codigo, Tipo) VALUES (5, 'Boleto');

-- Populando a tabela NF_Compra
INSERT INTO NF_Compra (Codigo, Data_Emissao, Valor, CNPJ_Fornecedor) 
VALUES (1, '2025-01-01', 550.00, '12345678000101');
INSERT INTO NF_Compra (Codigo, Data_Emissao, Valor, CNPJ_Fornecedor) 
VALUES (2, '2025-01-02', 900.00, '22345678000101');
INSERT INTO NF_Compra (Codigo, Data_Emissao, Valor, CNPJ_Fornecedor) 
VALUES (3, '2025-01-03', 450.00, '32345678000101');
INSERT INTO NF_Compra (Codigo, Data_Emissao, Valor, CNPJ_Fornecedor) 
VALUES (4, '2025-01-04', 800.00, '42345678000101');
INSERT INTO NF_Compra (Codigo, Data_Emissao, Valor, CNPJ_Fornecedor) 
VALUES (5, '2025-01-05', 1000.00, '52345678000101');

-- Populando a tabela NF_Venda
INSERT INTO NF_Venda (Codigo, Data_Emissao, Valor, CPF_Cliente) 
VALUES (1, '2025-01-06', 100.00, '12345678901');
INSERT INTO NF_Venda (Codigo, Data_Emissao, Valor, CPF_Cliente) 
VALUES (2, '2025-01-07', 200.00, '22345678901');
INSERT INTO NF_Venda (Codigo, Data_Emissao, Valor, CPF_Cliente) 
VALUES (3, '2025-01-08', 150.00, '32345678901');
INSERT INTO NF_Venda (Codigo, Data_Emissao, Valor, CPF_Cliente) 
VALUES (4, '2025-01-09', 250.00, '42345678901');
INSERT INTO NF_Venda (Codigo, Data_Emissao, Valor, CPF_Cliente) 
VALUES (5, '2025-01-10', 300.00, '52345678901');

-- Populando a tabela ContaPagar
INSERT INTO ContaPagar (Codigo, Data_Compra, Data_Paga, Data_Vencimento, Valor, Codigo_NF, CNPJ_Fornecedor) 
VALUES (1, '2025-01-01', '2025-01-10', '2025-01-15', 550.00, 1, '12345678000101');
INSERT INTO ContaPagar (Codigo, Data_Compra, Data_Paga, Data_Vencimento, Valor, Codigo_NF, CNPJ_Fornecedor) 
VALUES (2, '2025-01-02', '2025-01-12', '2025-01-20', 900.00, 2, '22345678000101');
INSERT INTO ContaPagar (Codigo, Data_Compra, Data_Paga, Data_Vencimento, Valor, Codigo_NF, CNPJ_Fornecedor) 
VALUES (3, '2025-01-03', '2025-01-13', '2025-01-25', 450.00, 3, '32345678000101');
INSERT INTO ContaPagar (Codigo, Data_Compra, Data_Paga, Data_Vencimento, Valor, Codigo_NF, CNPJ_Fornecedor) 
VALUES (4, '2025-01-04', '2025-01-14', '2025-01-30', 800.00, 4, '42345678000101');
INSERT INTO ContaPagar (Codigo, Data_Compra, Data_Paga, Data_Vencimento, Valor, Codigo_NF, CNPJ_Fornecedor) 
VALUES (5, '2025-01-05', '2025-01-15', '2025-02-05', 1000.00, 5, '52345678000101');

-- Populando a tabela ContaReceber
INSERT INTO ContaReceber (Codigo, Data_Venda, Data_Vencimento, Data_Paga, Valor, Codigo_NF, CPF_Cliente) 
VALUES (1, '2025-01-06', '2025-01-16', '2025-01-20', 100.00, 1, '12345678901');
INSERT INTO ContaReceber (Codigo, Data_Venda, Data_Vencimento, Data_Paga, Valor, Codigo_NF, CPF_Cliente) 
VALUES (2, '2025-01-07', '2025-01-17', '2025-01-22', 200.00, 2, '22345678901');
INSERT INTO ContaReceber (Codigo, Data_Venda, Data_Vencimento, Data_Paga, Valor, Codigo_NF, CPF_Cliente) 
VALUES (3, '2025-01-08', '2025-01-18', '2025-01-25', 150.00, 3, '32345678901');
INSERT INTO ContaReceber (Codigo, Data_Venda, Data_Vencimento, Data_Paga, Valor, Codigo_NF, CPF_Cliente) 
VALUES (4, '2025-01-09', '2025-01-19', '2025-01-28', 250.00, 4, '42345678901');
INSERT INTO ContaReceber (Codigo, Data_Venda, Data_Vencimento, Data_Paga, Valor, Codigo_NF, CPF_Cliente) 
VALUES (5, '2025-01-10', '2025-01-20', '2025-01-30', 300.00, 5, '52345678901');

-- Populando a tabela Item_NF_Compra
INSERT INTO Item_NF_Compra (Codigo, Quantidade, Valor_Uni, Valor_Total, Codigo_NF, Codigo_Produto) 
VALUES (1, 50, 5.50, 275.00, 1, 1);
INSERT INTO Item_NF_Compra (Codigo, Quantidade, Valor_Uni, Valor_Total, Codigo_NF, Codigo_Produto) 
VALUES (2, 100, 3.00, 300.00, 2, 2);
INSERT INTO Item_NF_Compra (Codigo, Quantidade, Valor_Uni, Valor_Total, Codigo_NF, Codigo_Produto) 
VALUES (3, 30, 7.00, 210.00, 3, 3);
INSERT INTO Item_NF_Compra (Codigo, Quantidade, Valor_Uni, Valor_Total, Codigo_NF, Codigo_Produto) 
VALUES (4, 80, 4.50, 360.00, 4, 4);
INSERT INTO Item_NF_Compra (Codigo, Quantidade, Valor_Uni, Valor_Total, Codigo_NF, Codigo_Produto) 
VALUES (5, 20, 20.00, 400.00, 5, 5);

-- Populando a tabela Item_NF_Venda
INSERT INTO Item_NF_Venda (Codigo, Quantidade, Valor_Uni, Valor_Total, Codigo_NF, Codigo_Produto) 
VALUES (1, 10, 5.50, 55.00, 1, 1);
INSERT INTO Item_NF_Venda (Codigo, Quantidade, Valor_Uni, Valor_Total, Codigo_NF, Codigo_Produto) 
VALUES (2, 20, 3.00, 60.00, 2, 2);
INSERT INTO Item_NF_Venda (Codigo, Quantidade, Valor_Uni, Valor_Total, Codigo_NF, Codigo_Produto) 
VALUES (3, 15, 7.00, 105.00, 3, 3);
INSERT INTO Item_NF_Venda (Codigo, Quantidade, Valor_Uni, Valor_Total, Codigo_NF, Codigo_Produto) 
VALUES (4, 25, 4.50, 112.50, 4, 4);
INSERT INTO Item_NF_Venda (Codigo, Quantidade, Valor_Uni, Valor_Total, Codigo_NF, Codigo_Produto) 
VALUES (5, 5, 20.00, 100.00, 5, 5);

-- Populando a tabela NF_Compra_Pagamento
INSERT INTO NF_Compra_Pagamento (Codigo, Codigo_NF, Codigo_Pagamento) 
VALUES (1, 1, 'Cartão de Crédito');
INSERT INTO NF_Compra_Pagamento (Codigo, Codigo_NF, Codigo_Pagamento) 
VALUES (2, 2, 'Pix');
INSERT INTO NF_Compra_Pagamento (Codigo, Codigo_NF, Codigo_Pagamento) 
VALUES (3, 3, 'Boleto');
INSERT INTO NF_Compra_Pagamento (Codigo, Codigo_NF, Codigo_Pagamento) 
VALUES (4, 4, 'Cartão de Débito');
INSERT INTO NF_Compra_Pagamento (Codigo, Codigo_NF, Codigo_Pagamento) 
VALUES (5, 5, 'Dinheiro');

-- Populando a tabela NF_Venda_Pagamento
INSERT INTO NF_Venda_Pagamento (Codigo, Codigo_NF, Codigo_Pagamento) 
VALUES (1, 1, 'Pix');
INSERT INTO NF_Venda_Pagamento (Codigo, Codigo_NF, Codigo_Pagamento) 
VALUES (2, 2, 'Cartão de Crédito');
INSERT INTO NF_Venda_Pagamento (Codigo, Codigo_NF, Codigo_Pagamento) 
VALUES (3, 3, 'Dinheiro');
INSERT INTO NF_Venda_Pagamento (Codigo, Codigo_NF, Codigo_Pagamento) 
VALUES (4, 4, 'Boleto');
INSERT INTO NF_Venda_Pagamento (Codigo, Codigo_NF, Codigo_Pagamento) 
VALUES (5, 5, 'Cartão de Débito');

-- Adicionado cliente fictício
INSERT INTO cliente (CPF, Nome, Tel_Fixo, Tel_Celular, Cidade, Bairro, Numero, Rua, CEP, Sigla_UF) VALUES 
('00000000000', 'Cliente Fictício', '0000-0000', '00000-0000', 'Cidade Imaginária', 'Bairro Fantasma', 0, 'Rua Fictícia', '00000-000', 'MG');

-- Adicionando fornecedor ficticio
INSERT INTO Fornecedor (CNPJ, Nome, Tel_Fixo, Tel_Celular, Cidade, Bairro, Numero, Rua, CEP, Sigla_UF)
VALUES ('00000000000000', 'Fornecedor Padrão', '0000000000', '0000000000', 'Cidade Exemplo', 'Bairro Exemplo', 0, 'Rua Exemplo', '00000-000', 'MG');
