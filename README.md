### Projet Pierre-Feuille-Ciseau ###

### Récupération du projet ###

```shell
git clone git@github.com:Raixsow/docker-sae203.git
```

### Optention et lancement du serveur avec Docker

Création d'une image Docker:
```shell
docker build -t <nom-image> .
docker ps
```
Récupérer ce qui est écrit dans la section : "CONTAINER ID"

Création du conteneur (serveur) sur Docker:
```shell
docker run --name <nom-du-conteneur> -d -p <port-hôte>:80 <nom-image>
```

### Connexion au serveur de Jeu

cd docker-sae203/source

javac *.java

java Client


