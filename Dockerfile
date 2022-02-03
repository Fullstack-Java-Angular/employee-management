# Production
#FROM tomcat:10.0.16-jdk11-openjdk-slim
#COPY ./target/employee-management-1.0-SNAPSHOT.war /usr/local/tomcat/webapps
#CMD ["catalina.sh", "run"]

# Development
FROM maven:3.8-jdk-11 as maven_builder
WORKDIR /app
COPY src ./src
COPY pom.xml .
RUN mvn clean package

FROM tomcat:10.0.16-jdk11-openjdk-slim
COPY --from=maven_builder /app/target/employee-management-1.0-SNAPSHOT.war /usr/local/tomcat/webapps
CMD ["catalina.sh", "run"]
