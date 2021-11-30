## Search Cities API REST


Esse Código é um projeto desenvolvido usando Arquitetura REST para consultas de Cidades e Estados do Brasil e de Países através de um banco de dados PostgreSQL.
Há também uma implementação de busca manual de distância entre pontos através do ID relacionado no bando de dados.
Sinta-se a vontade para comentar e usar o código para estudos! Se tiver alguma dúvida ou sugestão, sinta-se livre para me contactar.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------
This Code is a project developed using REST Architecture for queries of Cities and States in Brazil and Countries through a PostgreSQL database.
There is also an implementation of manual search of distance between points via the related ID in the database.
Feel free to comment and use the code for studies! If you have any questions or suggestions, please feel free to contact me.

Link para o repositório SQL / link for the SQL Repository:

https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL


cd ~/workspace/sql-paises-estados-cidades/PostgreSQL

docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

psql -h localhost -U postgres_user_city cities

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;

