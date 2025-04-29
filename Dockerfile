# Utiliser l'image debian officielle comme image parent
from debian:latest

# Création des répertoires de merde
workdir /usr/local/games/app/source

# Installer des services et des packages
run apt-get update && \
    apt-get -y install && \
    apt-get install -y default-jdk \
    apache2

# Copier les fichiers de l'hôte vers l'image
copy ./source /usr/local/games/app/source

# Se déplace dans le répertoire source et compile les différents fichiers
run javac *.java

# Execute le jeu
cmd ["java", "Serveur"]

# Exposer le port 45369
expose 45369