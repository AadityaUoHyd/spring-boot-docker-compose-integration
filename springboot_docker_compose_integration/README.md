# How to execute this program :

- First of all start your docker engine. And now run your spring boot program.

- When you run the code, it'll check the docker-compose configured file which you have to write & have to keep it in the current directory. <br>
Spring boot supports following files by default:  <br>
=> compose.yaml  <br>
=> compose.yml  <br>
=> docker-compose.yaml  <br>
=> docker-compose.yml  <br>

To use a non-standard file, set the spring.docker.compose.file property.

- you can find the container is running there :
![](https://github.com/AadityaUoHyd/spring-boot-docker-compose-integration/blob/master/doc.jpg)

- In case you have installed portainer for docker UI :
![](https://github.com/AadityaUoHyd/spring-boot-docker-compose-integration/blob/master/portainer.jpg)

- Now test you code using these endpoints :
![](https://github.com/AadityaUoHyd/spring-boot-docker-compose-integration/blob/master/test.jpg)

- POST request via POSTMAN :
![](https://github.com/AadityaUoHyd/spring-boot-docker-compose-integration/blob/master/post.jpg)

- GET request via POSTMAN :
![](https://github.com/AadityaUoHyd/spring-boot-docker-compose-integration/blob/master/get.jpg)

# The life-cycle management of services :

By default, the services declared in the configuration file will be started up using docker compose up and connection details beans for those services 
will be added to the application context so that the services can be used without any further configuration. When the application stops, the services 
will then be shut down using docker compose down. This lifecycle management and the commands used to start up and shut down the services can be customized 
using the spring.docker.compose.lifecycle-management, spring.docker.compose.startup.command, and spring.docker.compose.shutdown.command configuration properties.

# Refer Source :
https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.1.0-RC1-Release-Notes
