FROM anapsix/alpine-java:8_jdk_nashorn
RUN mkdir /myapp
COPY hello.jar /myapp/hello.jar
CMD ["java", "-jar", "/myapp/hello.jar"]
