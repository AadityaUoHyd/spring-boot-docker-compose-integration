# spring-boot-docker-compose-integration

A new module, spring-boot-docker-compose, provides integration with Docker Compose. 
When your app is starting up with given maven/gradle dependency, the Docker Compose integration will look for a configuration docker property file
in the current working directory. You just need to ensure your docker engine is running, and rest of thing will work automatically. It'll pull 
the image you mentioned in docker property file, from docker registry. Be it :-

-Elasticsearch <br>
-MariaDB with JDBC and R2DBC <br>
-MongoDB <br>
-MySQL with JDBC and R2DBC <br>
-PostgreSQL with JDBC and R2DBC <br>
-RabbitMQ <br>
-Redis <br>
-Zipkin <br>

Here, I'm doing PoC for postgreSQL. No need to externally create postgreSQL db using docker, spring boot program will do it for you.
Kindly find details, inside the above folder.
