-- H2 é banco de memória ram, é para testes! Portanto ele apaga toda vez que é fechado.
-- assim ele popula o banco de dados com este arquivo

create table usuario (
    id int not null primary key,
    nome varchar(18) not null,
    senha varchar(30) not null,
    email varchar(100) not null
)

INSERT INTO usuario (nome, senha, email) value
("admin", "garibaldo123", "admin@adm.com"),
("pedro", "123", "pedro@adm.com"),
("gabriel", "123", "gabriel@adm.com"),
("roberto", "999", "roberto@adm.com");



