## Modular samples for IntelliJ

JavaFX 13 samples to run from IntelliJ with different options and build tools

Version IntelliJ IDEA 2019.1

Download [JDK 11 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory. 

### Maven

Clone the sample, open it with IntelliJ, and make sure the paths for JDK and JavaFX match those on your machine.

Run from command line:

    mvn clean javafx:run

As well, this will work from the terminal on Linux or Mac:

    java --module-path $PATH_TO_FX:target/hellofx-1.0-SNAPSHOT.jar -m hellofx/org.openjfx.MainApp

or on Windows:
    
    java --module-path %PATH_TO_FX%:target\hellofx-1.0-SNAPSHOT.jar -m hellofx/org.openjfx.MainApp

To create and run a custom JRE, from terminal:

On Linux or Mac run:

    cd IDE/IntelliJ/Modular/Maven/hellofx
    mvn clean javafx:jlink
    target/hellofx/bin/launcher

On Windows run:

    cd IDE\IntelliJ\Modular\Maven\hellofx
    mvn clean javafx:jlink
    target\hellofx\bin\launcher
