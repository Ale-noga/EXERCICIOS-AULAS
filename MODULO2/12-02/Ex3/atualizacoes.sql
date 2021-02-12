SELECT * FROM db_escola.alunos;

INSERT INTO db_escola.alunos (nome, idade, grau, serie, notafinal)
VALUES ("ALEXANDRE", 15, "MEDIO", 3, 8.9),("LEONARDO", 15, "MEDIO", 3, 9.7),("CAROLINE", 14, "MEDIO", 2, 7.9),
("MARCELO", 13, "MEDIO", 1, 6.8), ("MATHEUS", 14, "MEDIO", 2, 7.5), ("VITOR", 15, "MEDIO", 3, 10), ("MARINA", 13, "MEDIO", 1, 9.5), 
("JOÃO",15, "MEDIO", 3, 4.9);

SELECT * FROM db_escola.alunos WHERE notafinal > 7;

SELECT * FROM db_escola.alunos WHERE notafinal < 7;

UPDATE db_escola.alunos SET notafinal = 6.5 WHERE id = 4;
