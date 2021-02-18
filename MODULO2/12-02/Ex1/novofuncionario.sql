SELECT * FROM db_funcionarios.funcionarios;

INSERT INTO db_funcionarios.funcionarios (nome, idade, forma├º├úo, cargo, salario)
VALUES ("RODRIGO", 50, "Ensino Medio", "Gerente G", 7000);

UPDATE db_funcionarios.funcionarios SET cargo = "Supervisor" WHERE idfuncionarios = 1;