SELECT * FROM db_generation_game_online.personagem WHERE atk > 2000;
SELECT * FROM db_generation_game_online.personagem WHERE def > 1000 AND def <2000;
SELECT * FROM db_generation_game_online.personagem WHERE nome LIKE "k%"; -- FIZ COM A LETRA K POIS NENHUM PERSOGEM INLUI A LETRA C RS
SELECT * FROM db_generation_game_online.personagem INNER JOIN classe ON personagem.fk_idclasse = classe.idclasse;
SELECT * FROM db_generation_game_online.personagem WHERE natureza = "FOGO";
