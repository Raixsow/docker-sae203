# Utiliser l'image debia officielle comme image parent
from debian:latest

# Installer des services et des packages
run apt-get update && \
    apt-get -y install  \
    apache2

# Copier les fichiers de l'hôte vers l'image
copy ./source /usr/local/games

# Exposer le port 80
expose 80