FROM openjdk:17-alpine
MAINTAINER email="rgupta.mtech@gmail.com"
EXPOSE 8080
ADD target/*.jar productapp.jar
ENTRYPOINT ["java","-jar","productapp.jar"]
