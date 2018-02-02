FROM nirothegreat/niros:vanilla
LABEL maintainer Niro <niro.liyanage@gmail.com>

ENV PROJECT_DIR=/opt/helloworld
WORKDIR $PROJECT_DIR

ADD gs-spring-boot-1.0-SNAPSHOT.jar  /opt/helloworld

RUN java -jar /opt/helloworld/gs-spring-boot-1.0-SNAPSHOT.jar > helloworld.log 2>&1 &

HEALTHCHECK CMD curl --fail http://localhost:8080/healthcheck || exit 1


