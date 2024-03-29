## Modular samples for NetBeans

JavaFX samples to run from NetBeans with different options and build tools.

Download [JDK 17 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory. 

Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

### Maven

Clone the sample, open it with NetBeans, and make sure the paths for JDK and JavaFX match those on your machine.

Clean, build and run from the NetBeans usual buttons, or from command line:

    mvn clean javafx:run

As well, this will work from the terminal on Linux or Mac:

    java --module-path $PATH_TO_FX:target/hellofx-1.0-SNAPSHOT.jar -m hellofx/org.openjfx.MainApp

or on Windows:
    
    java --module-path %PATH_TO_FX%:target\hellofx-1.0-SNAPSHOT.jar -m hellofx/org.openjfx.MainApp

To create and run a custom JRE, from terminal:

On Linux or Mac run:

    cd IDE/NetBeans/Modular/Maven/hellofx
    mvn clean javafx:jlink
    target/hellofx/bin/launcher

On Windows run:

    cd IDE\NetBeans\Modular\Maven\hellofx
    mvn clean javafx:jlink
    target\hellofx\bin\launcher