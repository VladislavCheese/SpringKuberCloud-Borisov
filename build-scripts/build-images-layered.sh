#!/bin/bash

function unpack() {
  FOLDER=$1
  NAME=$2
  VERSION=$3

# Сохраняем текущий каталог
  CURRENT=$(pwd)

# Переходим в нужнй модуль, в target папку и распаковываем слоеный jar
  cd $FOLDER/target
  java -jar -Djarmode=layertools ${NAME}-${VERSION}.jar extract

# Возвращаемся в сохраненный каталог
  cd $CURRENT
}

function build() {
  FOLDER=$1
  NAME=$2

  docker build -f ./build-scripts/docker/layered/Dockerfile \
    --build-arg JAR_FOLDER=${FOLDER}/target \
    -t ${NAME}:latest \
    -t ${NAME}:layered .
}

APP_VERSION=0.0.1-SNAPSHOT

# Переходим в общий каталог
cd ..

# Собираем все модули
echo "Building JAR files"
mvn clean package -DskipTests

# Поочереди залезаем в каждый модуль, передавая название модуля, название jar и версию
echo "Unpacking JARs"
unpack config-server config-server ${APP_VERSION}
unpack discovery-service discovery-service ${APP_VERSION}
unpack examinator examinator ${APP_VERSION}
unpack mathematic mathematic ${APP_VERSION}
unpack history history ${APP_VERSION}

# Поочереди запускаем сборку образов, передавая название модуля и название image
echo "Building Docker image"
build config-server application/config-server
build discovery-service application/discovery-service
build examinator application/examinator
build mathematic application/provider-math
build history application/provider-history