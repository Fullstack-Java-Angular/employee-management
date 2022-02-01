FROM tomcat:10.0.16-jdk11-openjdk-slim
COPY ./target/employee-management-1.0-SNAPSHOT.war /usr/local/tomcat/webapps
CMD ["catalina.sh", "run"]