#!/bin/bash

docker run --rm -v "$(pwd)":/app -w /app java sh -c 'javac -verbose -cp "json-java.jar:gson-2.2.4.jar" Hello.java'
