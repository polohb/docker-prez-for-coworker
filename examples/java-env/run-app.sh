#!/bin/bash

docker run --rm -v "$(pwd)":/app -w /app java sh -c 'java -cp gson-2.2.4.jar:json-java.jar:. Hello'
