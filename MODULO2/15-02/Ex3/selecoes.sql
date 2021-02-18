INSERT INTO db_farmacia_do_bem.categoria (tipo, composicao, cuidado)
VALUES ('Fitoterápico', 'Plantas', 'Tem Amb'),
('Halopático', 'Processadas', 'Tem Amb'),
('Homeopático', 'Dinamização', 'Tem Amb');

INSERT INTO db_farmacia_do_bem.produto (nome, lote, fabricacao, validade, preco, categoria_idcategoria)
VALUES ('Girotora', 'GR65G885', '11/05/2021', '11/05/2025', 139.99, 1),
('Halok', '6R5G4651RGR', '25/04/2020', '25/04/2025', 12.99, 3),
('Anjoli', '3GR1G581', '30/07/2020', '30/07/2025', 265.99, 2),
('Kalouco', 'GRG8H1647', '29/01/2020', '29/01/2025', 23.00, 2),
('Badopen', 'FG56ETBN14694', '14/05/2020', '14/05/2025', 467.99, 3),
('Gilol', 'BRGB5BBRT126', '06/03/2020', '06/03/2025', 12.99, 1),
('Vilomus', 'BNT56TR1', '25/06/2020', '25/06/2025', 15.25, 1),
('Volut', '41NG56N1', '31/12/2020', '31/12/2025', 17.99, 3);

SELECT * FROM db_farmacia_do_bem.produto WHERE preco > 50;
SELECT * FROM db_farmacia_do_bem.produto WHERE preco > 3 AND preco < 60;
SELECT * FROM db_farmacia_do_bem.produto WHERE nome LIKE "B%";
SELECT * FROM db_farmacia_do_bem.produto INNER JOIN categoria ON categoria_idcategoria = categoria.idcategoria;
SELECT * FROM db_farmacia_do_bem.produto INNER JOIN categoria ON categoria_idcategoria = categoria.idcategoria WHERE tipo = "Fitoterápico";