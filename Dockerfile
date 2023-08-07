FROM openjdk:8
EXPOSE 9092
ADD target/demoApp2.jar demoApp2.jar
ENTRYPOINT [ "java","-jar","/demoApp2.jar" ]