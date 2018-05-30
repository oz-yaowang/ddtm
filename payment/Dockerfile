FROM java:8
RUN mkdir -p /usr/local/src
COPY target/*.jar /usr/local/src/

ENTRYPOINT java -jar /usr/local/src/*.jar