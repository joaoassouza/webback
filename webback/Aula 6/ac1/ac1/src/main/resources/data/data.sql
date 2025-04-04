INSERT INTO cliente (id, cpf, celular, nome) VALUES (1, '555.555.555-12', '(13)900831453', 'Carlos Souza');
INSERT INTO cliente (id, cpf, celular, nome) VALUES (2, '111.111.111-11', '(11)912345678', 'Ana Lima');
INSERT INTO cliente (id, cpf, celular, nome) VALUES (3, '222.222.222-22', '(21)998877665', 'Marcos Pereira');
INSERT INTO cliente (id, cpf, celular, nome) VALUES (4, '333.333.333-33', '(19)988776655', 'Laura Costa');
INSERT INTO cliente (id, cpf, celular, nome) VALUES (5, '444.444.444-44', '(16)911223344', 'Fernanda Souza');
INSERT INTO cliente (id, cpf, celular, nome) VALUES (6, '666.666.666-66', '(13)911119999', 'Pedro Henrique');
INSERT INTO cliente (id, cpf, celular, nome) VALUES (7, '777.777.777-77', '(17)977776666', 'Camila Braga');
INSERT INTO cliente (id, cpf, celular, nome) VALUES (8, '888.888.888-88', '(18)988889999', 'João Mendes');
INSERT INTO cliente (id, cpf, celular, nome) VALUES (9, '999.999.999-99', '(15)955554444', 'Rafael Ribeiro');
INSERT INTO cliente (id, cpf, celular, nome) VALUES (10, '123.456.789-00', '(14)922223333', 'José Antônio Souza e Cruz');

INSERT INTO produto (id, descricao, preco, setor, validade) VALUES (1001, 'Buchinha de limpeza', 14.90, 'Limpeza', '2025-07-01');
INSERT INTO produto (id, descricao, preco, setor, validade) VALUES (1002, 'Detergente Neutro', 3.49, 'Limpeza', '2026-01-01');
INSERT INTO produto (id, descricao, preco, setor, validade) VALUES (1003, 'Sabão em pó', 9.99, 'Limpeza', '2026-05-15');
INSERT INTO produto (id, descricao, preco, setor, validade) VALUES (1004, 'Água sanitária', 4.50, 'Limpeza', '2026-03-01');
INSERT INTO produto (id, descricao, preco, setor, validade) VALUES (1005, 'Leite Integral', 6.20, 'Laticínios', '2025-04-25');
INSERT INTO produto (id, descricao, preco, setor, validade) VALUES (1006, 'Queijo Minas', 33.90, 'Laticínios', '2025-06-18');
INSERT INTO produto (id, descricao, preco, setor, validade) VALUES (1007, 'Iogurte Natural', 5.50, 'Laticínios', '2025-04-19');
INSERT INTO produto (id, descricao, preco, setor, validade) VALUES (1008, 'Refrigerante', 7.00, 'Bebidas', '2026-12-31');
INSERT INTO produto (id, descricao, preco, setor, validade) VALUES (1009, 'Suco de Uva', 8.99, 'Bebidas', '2026-08-12');
INSERT INTO produto (id, descricao, preco, setor, validade) VALUES (1010, 'Cerveja Lager', 4.20, 'Bebidas', '2026-11-11');
INSERT INTO produto (id, descricao, preco, setor, validade) VALUES (1011, 'Shampoo', 15.00, 'Higiene', '2027-01-01');
INSERT INTO produto (id, descricao, preco, setor, validade) VALUES (1012, 'Condicionador', 15.00, 'Higiene', '2027-01-01');
INSERT INTO produto (id, descricao, preco, setor, validade) VALUES (1013, 'Desodorante', 10.00, 'Higiene', '2026-10-10');
INSERT INTO produto (id, descricao, preco, setor, validade) VALUES (1014, 'Creme dental', 3.99, 'Higiene', '2026-09-09');
INSERT INTO produto (id, descricao, preco, setor, validade) VALUES (1015, 'Sabonete', 2.50, 'Higiene', '2026-12-12');

INSERT INTO venda (id, cliente_id, produto_id, descricao_produto, quantidade, preco_produto, valor_total, data_venda)
VALUES (1, 1, 1001, 'Buchinha de limpeza', 2, 14.90, 29.80, '2025-02-15T10:30:00');

INSERT INTO venda (id, cliente_id, produto_id, descricao_produto, quantidade, preco_produto, valor_total, data_venda)
VALUES (2, 2, 1006, 'Queijo Minas', 1, 33.90, 33.90, '2025-03-05T12:00:00');

INSERT INTO venda (id, cliente_id, produto_id, descricao_produto, quantidade, preco_produto, valor_total, data_venda)
VALUES (3, 3, 1005, 'Leite Integral', 4, 6.20, 24.80, '2025-01-10T09:00:00');

INSERT INTO venda (id, cliente_id, produto_id, descricao_produto, quantidade, preco_produto, valor_total, data_venda)
VALUES (4, 4, 1009, 'Suco de Uva', 5, 8.99, 44.95, '2025-03-25T16:00:00');

INSERT INTO venda (id, cliente_id, produto_id, descricao_produto, quantidade, preco_produto, valor_total, data_venda)
VALUES (5, 5, 1011, 'Shampoo', 3, 15.00, 45.00, '2025-02-20T14:00:00');

INSERT INTO venda (id, cliente_id, produto_id, descricao_produto, quantidade, preco_produto, valor_total, data_venda)
VALUES (6, 6, 1006, 'Queijo Minas', 50, 33.90, 1695.00, '2025-01-28T11:00:00');

INSERT INTO venda (id, cliente_id, produto_id, descricao_produto, quantidade, preco_produto, valor_total, data_venda)
VALUES (7, 10, 1006, 'Queijo Minas', 5, 33.90, 169.50, '2025-02-01T15:00:00');

INSERT INTO venda (id, cliente_id, produto_id, descricao_produto, quantidade, preco_produto, valor_total, data_venda)
VALUES (8, 10, 1008, 'Refrigerante', 100, 7.00, 700.00, '2025-03-15T17:00:00');
