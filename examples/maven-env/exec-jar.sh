#!/bin/bash



docker run -it --rm -v "${PWD}/sandbox-project/target/sandbox-project-0.0.1-SNAPSHOT.jar":/tmp/sandbox-project-0.0.1-SNAPSHOT.jar java java -version


#docker run -it --rm -v "${PWD}/sandbox-project/target/sandbox-project-0.0.1-SNAPSHOT.jar":/tmp/sandbox-project-0.0.1-SNAPSHOT.jar java java -jar /tmp/sandbox-project-0.0.1-SNAPSHOT.jar
