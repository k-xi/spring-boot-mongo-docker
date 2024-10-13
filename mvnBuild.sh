docker-compose down
mvn clean install -DskipTests
mvn clean package
docker build -t springboot-mongo-app .
docker-compose up -d
