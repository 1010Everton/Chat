CREATE TABLE cadastro (
    id bigint not null auto_increment,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    senha VARCHAR(10) NOT NULL,
    cep VARCHAR(9),
    idade TINYINT(10),
    cpf BIGINT(10)
);