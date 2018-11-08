# samples for NetBeans

JavaFX 11 samples to run from NetBeans with different options and build tools

Version NetBeans [10vc2](https://dist.apache.org/repos/dist/dev/incubator/netbeans/incubating-netbeans/incubating-10.0-vc2/incubating-netbeans-10.0-vc2-bin.zip)

Download an appropriate [JDK 11](https://jdk.java.net/11/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

The samples assume NetBeans 10 runs on JDK 11 (this can be set editing the `etc/netbeans.conf` file
and setting `netbeans_jdkhome="/path/to/jdk11"`).

## Ant

For the first time only:

- Download [JavaFX SDK](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

- Open NetBeans and create a global Library under `NetBeans -> Tools -> Libraries -> New Library`.
Name it `JavaFX11` and include the jars under the lib folder from JavaFX 11 (but not the `src.zip` file).

Clone the sample, open it with NetBeans, and make sure the paths for Java 11 and 
JavaFX 11 match those on your machine.

## Maven

Clone the sample, open it with NetBeans and reload the POM. Clean, build and run
from the NetBeans usual buttons.

## Gradle

For the first time only:

- Install manually the Gradle plugin for NetBeans 2.0.1 from the 
[GitHub repository](https://github.com/kelemen/netbeans-gradle-project/releases).

Clone the sample, open it with NetBeans and reload the project. Build and run
from the Tasks context-menu.

## Modular

Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

### Ant

For the first time only:

- Download [JavaFX SDK](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

- Open NetBeans and create a global Library under `NetBeans -> Tools -> Libraries -> New Library`.
Name it `JavaFX11` and include the jars under the lib folder from JavaFX 11 (but not the `src.zip` file).

- Create a global Library under `NetBeans -> Tools -> Libraries -> New Library`.
Name it `JavaFXMODS11` and include the folder JavaFX jmods 11.

Clone the sample, open it with NetBeans, and make sure the paths for Java 11 and 
JavaFX 11 match those on your machine.

Clean and build with regular button to create a custom JRE.
Run with regular button.

To run the custom JRE on Mac:

    dist/jlink/HelloFX/bin/java -m hellofx/org.openjfx.MainApp

To run the custom JRE on Windows:

    dist\jlink\HelloFX\bin\java -m hellofx/org.openjfx.MainApp

### Maven

Clone the sample, open it with NetBeans, and make sure the paths for Java 11 and 
JavaFX 11 match those on your machine.

Clean, build and run from the NetBeans usual buttons, or from command line:

    mvn clean compile package exec:java

As well, this will work from the terminal on Linux or Mac:

    java --module-path $PATH_TO_FX:target/hellofx-1.0-SNAPSHOT.jar -m hellofx/org.openjfx.MainApp

or on Windows:
    
    java --module-path %PATH_TO_FX%:target\hellofx-1.0-SNAPSHOT.jar -m hellofx/org.openjfx.MainApp

To create and run a custom JRE, from terminal:

On Linux or Mac run:

    cd IDE/NetBeans/Modular/Ant/hellofx
    export PATH_TO_FX_MODS=path/to/javafx-jmods-11
    $JAVA_HOME/bin/jlink --module-path $PATH_TO_FX_MODS:target/hellofx-1.0-SNAPSHOT.jar --add-modules=hellofx --output jre
    jre/bin/java -m hellofx/org.openjfx.MainApp

On Windows run:

    cd IDE\NetBeans\Modular\Ant\hellofx
    set PATH_TO_FX_MODS="path\to\javafx-jmods-11"
    %JAVA_HOME%\bin\jlink --module-path "%PATH_TO_FX_MODS%;target\hellofx-1.0-SNAPSHOT.jar" --add-modules=hellofx --output jre
    jre\bin\java -m hellofx/org.openjfx.MainApp

### Gradle

For the first time only:

- Install manually the Gradle plugin for NetBeans 2.0.1 from the 
[GitHub repository](https://github.com/kelemen/netbeans-gradle-project/releases).

- Add `org.gradle.java.home` to a `gradle.properties` file, with the path to JDK 11, and
 `path.to.fx.mods` to a `gradle.properties` file, with the path to JDK jmods. This file 
can be part of the project or under the gradle user home `USER_HOME/.gradle`. 

Clone the sample, open it with NetBeans and reload the project. Build and run
from the Tasks context-menu. Run the `jlink` task to create a custom runtime image:

Run:

    hellofx/bin/java -m hellofx/org.openjfx.MainApp
