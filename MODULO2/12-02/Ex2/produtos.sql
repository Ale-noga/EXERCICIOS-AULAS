SELECT * FROM db_ecommerce.produtos;

INSERT INTO db_ecommerce.produtos (nome, classe, quantidade, preco)
VALUE ("IPHONE", "Eletronico", 5, 9999.90),("SAMSUNG", "Eletronico", 7, 7999.99), ("LG", "Eletronico", 15, 6555.99),
("MOTOROLA", "Eletronico", 15, 6999.99), ("TV SMART", "Eletronico", 20, 9999.90), ("BRASTEMP", "Eletro", 12, 7989.90),
("CONSUL", "Eletro", 21, 4999.90),("RADIO", "Eletronico", 89, 239.99);

SELECT * FROM db_ecommerce.produtos WHERE preco > 500;

SELECT * FROM db_ecommerce.produtos WHERE preco < 500;

UPDATE db_ecommerce.produtos SET quantidade = 21 WHERE id = 1;
