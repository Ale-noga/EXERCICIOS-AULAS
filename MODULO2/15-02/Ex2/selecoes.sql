INSERT INTO db_pizzaria_legal.categoria (tipo, massa, sabor)
VALUES 
("Vegan", "Integral", "Salgada"),
("Vegan", "Branca", "Salgada"),
("Vegan", "Branca", "Doce"),
("Normal", "Branca", "Salgada"),
("Normal", "Branca", "Doce");

INSERT INTO db_pizzaria_legal.pizza(nome, tamanho, pedacos, borda, preco, fk_idcategoria)
VALUES
("Calabresa", "Normal", 8, "Catupiry", 35.00, 4),
("Mussarela", "Normal", 8, "Catupiry", 35.00, 4),
("Brocolis", "Normal", 8, "Cheddar", 50.00, 1),
("Rúcula", "Normal", 8, "Catupiry", 60.00, 2),
("Brigadeiro", "Broto", 4, "Chocolate", 85.00, 5),
("Morango com Chocolate", "Broto", 4, "Nutella", 85.00, 3),
("Gigante 4 Q", "Gigante", 12, "Catupiry", 120.00, 4),
("Gigante Brocolis", "Gigante", 12, "Cheddar", 147.00, 1);

SELECT * FROM db_pizzaria_legal.pizza WHERE preco > 45.00;
SELECT * FROM db_pizzaria_legal.pizza WHERE preco > 29.00 AND preco < 60.00;
SELECT * FROM db_pizzaria_legal.pizza WHERE nome LIKE "C%";
SELECT * FROM db_pizzaria_legal.pizza INNER JOIN categoria ON pizza.fk_idcategoria = categoria.idcategoria;
SELECT * FROM db_pizzaria_legal.pizza INNER JOIN categoria ON pizza.fk_idcategoria = categoria.idcategoria WHERE tipo = "Vegan";









