-- MYSQL

-- Tabela: Funcionário
CREATE TABLE Funcionario (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Nome VARCHAR(100) NOT NULL,
    Senha VARCHAR(100) NOT NULL,
    Cargo VARCHAR(100) NOT NULL,
    Data_Criada DATE NOT NULL,
    Data_Atualizada DATE NOT NULL
); 

-- Tabela: UF
CREATE TABLE UF (
    Codigo INT AUTO_INCREMENT UNIQUE,
    Sigla CHAR(2) PRIMARY KEY
);


-- Tabela: Fornecedor
CREATE TABLE Fornecedor (
    CNPJ VARCHAR(14) PRIMARY KEY,
    Nome VARCHAR(100) NOT NULL,
    Tel_Fixo VARCHAR(20),
    Tel_Celular VARCHAR(20),
    Cidade VARCHAR(50),
    Bairro VARCHAR(50),
    Numero INT,
    Rua VARCHAR(100),
    CEP VARCHAR(15),
    Sigla_UF CHAR(2),
    FOREIGN KEY (Sigla_UF) REFERENCES UF(Sigla)
);

-- Tabela: Cliente
CREATE TABLE Cliente (
    CPF VARCHAR(11) PRIMARY KEY,
    Nome VARCHAR(100) NOT NULL,
    Tel_Fixo VARCHAR(20),
    Tel_Celular VARCHAR(20),
    Cidade VARCHAR(50),
    Bairro VARCHAR(50),
    Numero INT,
    Rua VARCHAR(100),
    CEP VARCHAR(15),
    Sigla_UF CHAR(2),
    FOREIGN KEY (Sigla_UF) REFERENCES UF(Sigla)
);
-- Tabela: Produto
CREATE TABLE Produto (
    Codigo INT AUTO_INCREMENT PRIMARY KEY,
    Nome VARCHAR(100) NOT NULL,
    Estoque INT NOT NULL,
    Valor DECIMAL(10, 2) NOT NULL,
    Imposto DECIMAL(5, 2),
    Unidade VARCHAR(20)
);
-- Tabela: Forma_Pagamento
CREATE TABLE Forma_Pagamento (
    Codigo INT AUTO_INCREMENT UNIQUE,
    Tipo VARCHAR(50) PRIMARY KEY
);

-- Tabela: NF_Compra
CREATE TABLE NF_Compra (
    Codigo INT AUTO_INCREMENT PRIMARY KEY,
    Data_Emissao DATE NOT NULL,
    Valor DECIMAL(10, 2) NOT NULL,
    CNPJ_Fornecedor VARCHAR(14),
    FOREIGN KEY (CNPJ_Fornecedor) REFERENCES Fornecedor(CNPJ)
);

-- Tabela: NF_Venda
CREATE TABLE NF_Venda (
    Codigo INT AUTO_INCREMENT PRIMARY KEY,
    Data_Emissao DATE NOT NULL,
    Valor DECIMAL(10, 2) NOT NULL,
    CPF_Cliente VARCHAR(11),
    FOREIGN KEY (CPF_Cliente) REFERENCES Cliente(CPF)
);

-- Tabela: ContaPagar
CREATE TABLE ContaPagar (
    Codigo INT AUTO_INCREMENT PRIMARY KEY,
    Data_Compra DATE NOT NULL,
    Data_Paga DATE,
    Data_Vencimento DATE NOT NULL,
    Valor DECIMAL(10, 2) NOT NULL,
    Codigo_NF INT,
    CNPJ_Fornecedor VARCHAR(14),
    FOREIGN KEY (Codigo_NF) REFERENCES NF_Compra(Codigo),
    FOREIGN KEY (CNPJ_Fornecedor) REFERENCES Fornecedor(CNPJ)
);

-- Tabela: ContaReceber
CREATE TABLE ContaReceber (
    Codigo INT AUTO_INCREMENT PRIMARY KEY,
    Data_Venda DATE NOT NULL,
    Data_Vencimento DATE NOT NULL,
    Data_Paga DATE,
    Valor DECIMAL(10, 2) NOT NULL,
    Codigo_NF INT,
    CPF_Cliente VARCHAR(11),
    FOREIGN KEY (Codigo_NF) REFERENCES NF_Venda(Codigo),
    FOREIGN KEY (CPF_Cliente) REFERENCES Cliente(CPF)
);

-- Tabela intermediária: NF_Venda_Pagamento
CREATE TABLE NF_Venda_Pagamento (
    Codigo INT AUTO_INCREMENT,
    Codigo_NF INT,
    Codigo_Pagamento VARCHAR(50),
    PRIMARY KEY (Codigo, Codigo_Pagamento),
    FOREIGN KEY (Codigo_NF) REFERENCES NF_Venda(Codigo),
    FOREIGN KEY (Codigo_Pagamento) REFERENCES Forma_Pagamento(Tipo)
);

-- Tabela intermediária: NF_Compra_Pagamento
CREATE TABLE NF_Compra_Pagamento (
    Codigo INT AUTO_INCREMENT,
    Codigo_NF INT,
    Codigo_Pagamento VARCHAR(50),
    PRIMARY KEY (Codigo),
    FOREIGN KEY (Codigo_NF) REFERENCES NF_Compra(Codigo),
    FOREIGN KEY (Codigo_Pagamento) REFERENCES Forma_Pagamento(Tipo)
);  

-- Tabela: Item_NF_Compra
CREATE TABLE Item_NF_Compra (
    Codigo INT AUTO_INCREMENT PRIMARY KEY,
    Quantidade INT NOT NULL,
    Valor_Uni DECIMAL(10, 2) NOT NULL,
    Valor_Total DECIMAL(10, 2) NOT NULL,
    Codigo_NF INT,
    Codigo_Produto INT,
    FOREIGN KEY (Codigo_NF) REFERENCES NF_Compra(Codigo),
    FOREIGN KEY (Codigo_Produto) REFERENCES Produto(Codigo)
);

-- Tabela: Item_NF_Venda
CREATE TABLE Item_NF_Venda (
    Codigo INT AUTO_INCREMENT PRIMARY KEY,
    Quantidade INT NOT NULL,
    Valor_Uni DECIMAL(10, 2) NOT NULL,
    Valor_Total DECIMAL(10, 2) NOT NULL,
    Codigo_NF INT,
    Codigo_Produto INT,
    FOREIGN KEY (Codigo_NF) REFERENCES NF_Venda(Codigo),
    FOREIGN KEY (Codigo_Produto) REFERENCES Produto(Codigo)
);