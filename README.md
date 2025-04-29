### Projet Pierre-Feuille-Ciseau ###

# Pierre-Feuille-Ciseaux - Projet Java

## Résumé du Projet
Ce projet consiste à développer un jeu multijoueur de Pierre-Feuille-Ciseaux en Java.  
Le serveur gère les connexions de deux joueurs, les interactions et la logique de jeu.  
Chaque joueur peut saisir ses choix via le client, et le serveur détermine le gagnant de chaque manche.

---

## Les Classes Utilisées

### **Classe Serveur**
Gère la logique du jeu, la communication avec les deux clients et le calcul du gagnant.

### **Classe Client**
Permet aux joueurs de se connecter au serveur, de saisir leurs choix, et d'afficher les résultats.

### **Classe Joueur**
Modèle représentant les joueurs, stocke leurs noms, points et choix.

### **Classe PFC**
Contient les méthodes utilitaires pour déterminer le gagnant selon les règles du jeu.

---


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

