# ServletUsingTomcat

1)	D’abord à cause de la version Community de intellij IDEA on crée un projet de webapp en utilisant apache Maven. On crée une class java, elle sera notre servlet. On hérite de la class HttpServlet après l’avoir importer de jakarta.servlet (à cause d’utilisation de Tomcat 10 avant Tomcat 10 on utilise javax.servlet) et on surcharge la méthode service qu’on utilise un de ces paramètre pour prendre un PrintWriter pour écrire le code html.
Le projet webapp vient avec un fichier index.jsp qu’on utilise pour mettre le hyperlink
NB : on n’oublie pas de mettre l’annotation sur la class en mettant l’extension de l’url.

2)	On installe apache Tomcat dans mon cas c’est Tomcat 10. On peut configurer les utilisateur en les écrire dans le fichier Tomcat-users.xml. Après cela on peut utiliser un plugin de intellij appelé Smart Tomcat, on configure dans external Tools notre installation de Tomcat et comme cela on peut exécuter le code et on peut voir la page dans notre browser.

3)	Une autre façon est de configurer Maven pour nous donner un fichier WAR qu’on vas le mettre dans le folder webapps et en ouvrant dans le terminal bin de Tomcat on exécute la command ./startup.sh et on peut la voir dans notre browser.
