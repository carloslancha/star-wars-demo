# star-wars-demo

## Requirements

- Java 8

  http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

- Git

  It's important to have git setup so that you can easily move from one step to another during the workshop. Download: https://git-scm.com/downloads

- 2GB Free disk space

## Instructions

- Unzip the workspace zip in a folder of choice

- Open the command line and navigate to the workspace folder:

  `..Projects$ cd soy-portlet-workshop/star-wars-demo`

- Now, we are ready to the first deploy:

  `..Projects/soy-portlet-wokshop/star-wars-demo$ ./gradlew deploy`

- After a successful build, you can go to the bundles folder located inside the workspace folder and start the server:

  `..Projects/soy-portlet-wokshop/bundles$ sh tomcat-8.0.32/bin/catalina.sh run`

- Now, open your browser and go to http://localhost:8080/ (if the browser don't already opened automatically)

  You should be able to login using the default credentials:

	Email Address: test@liferay.com

	Password: test

- And finally, add the deployed portlet (Star Wars Demo) to the page.