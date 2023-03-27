FROM openjdk:19
LABEL maintainer = "javaguides.net"
ADD target/Assignment-0.0.1-SNAPSHOT.jar Assignment.jar
ENTRYPOINT ["java", "-jar", "Assignment.jar"]