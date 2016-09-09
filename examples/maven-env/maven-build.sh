#!/bin/bash
# --rm -< remove container -> always do all stuff like
# download and co

mkdir -p ${PWD}/m2

docker run -it --rm -v "${PWD}/m2":/home/polohb/.m2 -v "${PWD}/sandbox-project":/usr/src/sandbox-project -w /usr/src/sandbox-project  polohb/dev-maven mvn clean install
