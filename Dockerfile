# Utiliser l'image debian officielle comme image parent
from debian:latest

# Installer des services et des packages
run apt-get update && \
    apt-get -y install && \
    apt-get install -y default-jdk \
    apache2

# Creation des répertoires pour l'application
workdir /usr/local/app
workdir /usr/local/app/source
workdir /usr/local/app/class

# Copier les fichiers de l'hôte vers l'image
copy ./source /usr/local/app/source

# Se déplace dans le répertoire source et compile les différents fichiers
run cd /usr/local/app/source/
run javac *.java -d ../class
run cd ../class

# Execute le jeu
cmd ["java", "Serveur"]

# Exposer le port 45369
expose 45369