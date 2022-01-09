FROM openjdk:8
EXPOSE 8080
ADD target/springboot-image.jar springboot-images.jar
ENTRYPOINT ["java","-jar","/springboot-image.jar"]