# samples for Eclipse

JavaFX 11 samples to run from Eclipse with different options and build tools

Version Eclipse 2018-09 (4.9) Build id: I20180906-0745.

Download an appropriate [JDK 11](https://jdk.java.net/11/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

Note: If you get this message when you add JDK 11:
 
> You selected a JRE that this version of Eclipse JDT does not yet support fully. Some of the features may not work as expected.

then install this patch from MarketPlace: `Java 11 support for Eclipse 2018-09 (4.9)`.

## Ant

For the first time only:

- Download [JavaFX SDK](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

- Open Eclipse and create a string substitution variable under `Preferences->Run/Debug->String Substitution`, named `PATH_TO_FX` and
pointing to the JavaFX 11 lib folder. 

- Create a User Library under `Eclipse -> Window -> Preferences -> Java -> Build Path -> User Libraries -> New`.
Name it `JavaFX11` and include the jars under the lib folder from JavaFX 11.

Clone the sample, open it with Eclipse, and make sure the paths for Java 11 and 
JavaFX 11 match those on your machine.

Build the project and run with Run configurations-> Java Application -> HelloFX.

Note: Edit Run configurations... -> Arguments and make sure the option:
 
> Use the -XstartOnFirstThread argument when launching with SWT 

is not selected.

## Maven

For the first time only:

- Make sure you have the Maven Integration for Eclipse m2e plugin installed.

Clone the sample, open it with Eclipse and import the Maven changes. 

Run with Run configurations -> Maven -> hellofx

Note: on Windows, under Eclipse running Oracle JDK 1.8, you need to add `-Djava.library.path=C:\` 
to the `Run configuration... -> Maven Build -> hellofx -> JRE -> VM arguments`.

## Gradle

For the first time only:

- Make sure you have the Buildship Gradle Integration 2.0 plugin installed. Update to 2.2.3 version
from this [URL](http://download.eclipse.org/buildship/updates/e48/snapshots/2.x/).

- Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

- Add `org.gradle.java.home` to a `gradle.properties` file, with the path to JDK 11, and
 `path.to.fx.mods` to a `gradle.properties` file, with the path to JDK jmods. This file 
can be part of the project or under the gradle user home `USER_HOME/.gradle`. 

- Add the `JavaFX11` library to the modulepath of the project.

Clone the sample, open it with Eclipse and refresh the Gradle project. 

Run with Run configurations -> Gradle Project -> hellofx
