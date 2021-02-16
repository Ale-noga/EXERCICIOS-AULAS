INSERT INTO db_cidade_das_carnes.categoria (peca, familia, cuidado) 
VALUES ('CARNE', 'GADO', 'REFRI'),
('FRANGO', 'AVE', 'REFRI'),
('LINGUIÇA', 'SUINA', 'REFRI');

INSERT INTO db_cidade_das_carnes.produto (nome, tipo, fabricacao, validade, preco, categoria_idcategoria) 
VALUES ('PICANHA', 'BOI', '15/02/2021', '14/02/2022', 132.99, 1),
('CONTRAFILE', 'BOI', '15/02/2021', '14/02/2022', 145.99, 1),
('TOSCANA', 'PORCO', '15/02/2021', '14/02/2022', 58.99, 3),
('BACON', 'PORCO', '15/02/2021', '14/02/2022', 23.99, 3),
('PEITO', 'FRANGO', '15/02/2021', '14/02/2022', 140.99, 2),
('SOBRECOXA', 'FRANGO', '15/02/2021', '14/02/2022', 15.99, 2),
('MIGNON', 'BOI', '15/02/2021', '14/02/2022', 23.99, 1),
('PRESUNTO', 'PORCO', '15/02/2021', '14/02/2022', 200.00, 3);

SELECT * FROM db_cidade_das_carnes.produto WHERE preco > 50;
SELECT * FROM db_cidade_das_carnes.produto WHERE preco > 3 AND preco < 60;
SELECT * FROM db_cidade_das_carnes.produto WHERE nome LIKE "C%";
SELECT * FROM db_cidade_das_carnes.produto INNER JOIN db_cidade_das_carnes.categoria ON categoria_idcategoria = categoria.idcategoria;
SELECT * FROM db_cidade_das_carnes.produto INNER JOIN db_cidade_das_carnes.categoria ON categoria_idcategoria = categoria.idcategoria WHERE familia = "GADO";