### Projet Pierre-Feuille-Ciseau ###

### Récupération du projet ###

```shell
git clone git@github.com:Raixsow/docker-sae203.git
```

### Optention et lancement du serveur

```shell
docker build -t <nom-image> .
docker ps
docker run --name <nom-du-conteneur> -d -p <port-hôte>:80 <nom-image>
```
```java
"CONTAINER ID IMAGE COMMAND CREATED STATUS PORTS NAMES\n"
```

### Connexion au serveur de Jeu

cd docker-sae203/source

javac *.java

java Client


