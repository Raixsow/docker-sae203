### Projet Pierre-Feuille-Ciseau ###

### Récupération du projet ###

git clone git@github.com:Raixsow/docker-sae203.git

### Optention et lancement du serveur

docker build -t <nom-image> .
docker ps
docker run --name <nom-du-conteneur> -d -p <port-hôte>:80 <nom-image>

nom du conteneur : Nom affiché lorsque vous exécutez 'docker ps'
port hôte        : utilisez un port disponible
nom de l'image   : docker-images

### Connexion au serveur de Jeu

cd docker-sae203/source

javac *.java

java Client


