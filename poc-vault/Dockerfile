FROM maven:3.8.5-openjdk-11
ENV ENVVARIABLE="default"
COPY . /usr/src/poc-vault
WORKDIR /usr/src/poc-vault
RUN mvn clean install 
EXPOSE 8080
CMD [ "java", "-jar", "target/poc-vault-0.0.1-SNAPSHOT.jar", "--env-variable=${ENVVARIABLE}"]
