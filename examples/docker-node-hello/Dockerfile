# VERSION 0.1

FROM ubuntu:latest
MAINTAINER polohb <polohb@gmail.com>

# Install node and npm
RUN apt-get update \
    && apt-get install --no-install-recommends -y nodejs npm \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*

# add link @see install node on ubuntu
RUN ln -s /usr/bin/nodejs /usr/local/bin/node \
    && ln -s /usr/bin/npm /usr/local/bin/npm


# mount volume (current host folder "." as "/src" in the container)
ADD . /src

# Install app dependencies
RUN cd /src; npm install

EXPOSE  8080
CMD ["node", "/src/index.js"]
