FROM openjdk:17-jdk

WORKDIR /app

COPY target/springMasterClass-0.0.1-SNAPSHOT.jar /app/springMasterClass.jar

EXPOSE 8081

CMD ["java", "-jar", "springMasterClass.jar"]