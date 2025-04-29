### Projet Pierre-Feuille-Ciseau ###

### Récupération du projet ###

git clone git@github.com:Raixsow/docker-sae203.git

### Optention et lancement du serveur

docker ps
docker run --name <nom du conteneur> -d -p <port hôte>:80 <nom-de-l'image-choisie>

### Connexion au serveur de Jeu

cd docker-sae203/source

javac *.java

java Client


