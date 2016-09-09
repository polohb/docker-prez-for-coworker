build:
	docker build -t polohb/nodejs-webapp .

runcontainer:
	docker run --name node-wapp -p 49160:8080 -d polohb/nodejs-webapp
stop:
	docker stop node-wapp

clean :
	docker rm node-wapp
