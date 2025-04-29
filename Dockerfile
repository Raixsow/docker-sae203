# Utiliser l'image debian officielle comme image parent
from debian:latest

# Installer des services et des packages
run apt-get update && \
    apt-get -y install && \
    apt-get install -y default-jdk \
    apache2

# Creation d'un repertoire pour l'application
workdir usr/local/app

# Copier les fichiers de l'hôte vers l'image
copy ./source /usr/local/app/

# Compile tous les fichiers dans un repertoire annexe "class"
run javac @compile.list -d ../class

# Execute le jeu
cmd ["java", "Pierre_Feuille_Ciseaux.serveur.Serveur"]

# Exposer le port 45369
expose 45369