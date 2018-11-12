FROM java:8
EXPOSE 8080
ADD target/compose-0.0.1-SNAPSHOT.jar compose-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","compose-0.0.1-SNAPSHOT.jar"]