


1: curl - 
2: lire le css jusqu’à la fin. Le flat est là.
3: il y a des fichiers de git derrière dans l’arborescence du site.
Fait un dirb pour avoir l’arborescence. Tu sais accéder au fonder objects dans lequel il y a les fichiers de mise à jour du git
Il y a un script qui te permet de voir le contenu des fichiers de mise à jour.
gitit.py
Dans les fichiers il y a le flag mais en rot13. Tu peux le passer en rot13 bruteforce sur cyberchef.
4: c’est le JavaScript que je vous avais envoyé qui décode le mot de passe. Le JavaScript s’exécute sur ta machine, donc il faut modifier une condition pour débloquer le flag. JavaScript injection.  3nj0y-Th!$_CTF-@nd----h@ve-FuN!
La condition est si je me souviens bien : « AUTH_OK===ok » tu la change pour que ce soit vrai et tu fais exécuter le script.
5: il faut un dans le langage que tu veux qui redoux 5 opérations en mois de 5 secondes. Donc connexion au lecture du l’opération envoyer la réponse ainsi de suite 5 fois.
Un script
6: il faut bruteforcer un login dont le mdp est un pin de 4 caractères mais il y a un captcha à chaque opération.
7: c’est en rapport de DNS mais je n’en sais pas plus.
8: tu as un pcap et l’image dd d’un server. Sous Linux tu peux monter l’image via mount image.dd /folder
