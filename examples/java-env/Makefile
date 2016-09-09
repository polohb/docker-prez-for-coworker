
pull:
	docker pull java

compile :
	docker run --rm -v "$(CURDIR)":/app -w /app java sh -c 'javac -verbose -cp "json-java.jar:gson-2.2.4.jar" Hello.java'

run :
	docker run --rm -v "$(CURDIR)":/app -w /app java sh -c 'java -cp gson-2.2.4.jar:json-java.jar:. Hello'

clean :
	rm *.class



