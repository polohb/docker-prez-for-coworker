build:
	docker build -t polohb/ubuntu-node-hello .

runcontainer:
	docker run --name node-hello -p 8888:8080 -d polohb/ubuntu-node-hello


clean :
	docker rm node-hello
