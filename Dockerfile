FROM adoptopenjdk:14-jre-hotspot
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} task.jar
ENTRYPOINT ["java","-jar","/task.jar"]