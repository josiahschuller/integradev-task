# Library Management System

This repository contains code for a simple library management system and was developed for an interview at IntegraDev.

## User Interface Functionality

Users are able to:
* Add items (books or DVDs) to the library
* Add members to the library
* Borrow an item from the library
* Return an item to the library

## Running locally

This project is built using [Java JDK 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html), using the Corretto distribution.

In order to run locally, run the `main` method in the `Main` class.

To build locally using Gradle, use the following command:

```
./gradlew build
```

Then the build will be saved into `build/libs/`.

Then use `java -jar <FILE_PATH_TO_JAR>` in order to run the JAR file.

## Artefacts in GitHub Actions pipeline

I have set up the GitHub Actions CI pipeline to automatically build a JAR file and save it as an artefact. You can download artefacts at the bottom of the GitHub Actions page for a specific commit (see the image below).

<img src="https://github.com/josiahschuller/integradev-task/assets/45063215/6f4a49e5-9e96-44a9-af2b-d96de7422f12" width="80%">

Run the JAR file with `java -jar <FILE_PATH_TO_JAR>`. Make sure you have [Java JDK 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) installed!

## Class Diagram

I have documented a rough UML class diagram in the `Documentation` folder which describes the class relationships for this project.
