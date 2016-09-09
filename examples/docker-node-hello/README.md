# Docker example of a node.js Hello World app


## Prerequisites

- [docker](https://docs.docker.com/)


## Getting Started

###  Simple way : use the makefile

To build the image you can simply run `make build`.

And to run the container just use : `make runcontainer`.

### Other way : use docker cmd

To do the same things with docker just use :

`docker build -t polohb/ubuntu-node-hello .` to build the image.

and `docker run --name node-hello -p 8888:8080 -d polohb/ubuntu-node-hello` to exec it.

### Check

To check thi is really working just open http://localhost:8888 in your browser and you should see the following message :

`Hello World from container ;)`
