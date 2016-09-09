FROM maven:latest
MAINTAINER polohb <polohb@gmail.com>

# UID and GID need to be the same as the user on the host 
# here default for first created user

RUN useradd polohb --uid 1000 --gid 100 -s /bin/bash

USER polohb

CMD ["mvn"]
