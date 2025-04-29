### Projet Pierre-Feuille-Ciseau ###

### Récupération du projet ###

Dans le cas où votre répertoire n'a pas de sous-répertoire '.git', écrivez cette commande:
```shell
git init
``` 

Cloner le projet de cette même page github pour le récupérer.
```shell
git clone git@github.com:Raixsow/docker-sae203.git
```

### Optention et lancement du serveur avec Docker

Création d'une image Docker:
```shell
docker build -t <nom-image> .
docker images
```
et assurez-vous que l'image que vous venez de créer est bien inscrit dans la liste. 

Création du conteneur (serveur) sur Docker:
```shell
docker run --name <nom-du-conteneur> -d -p <port-hôte>:80 <nom-image>
```

### Connexion au serveur de Jeu

On se déplace dans le répertoire créé avec la commande 'git clone'
```shell
cd docker-sae203/source
```

On compile l'ensemble des fichiers:
```shell
javac *.java
```

On exécute le fichier Client:
```shell
java Client
```

Bonne chance à vous pour le Pierre-Feuille-Ciseaux !!

