## Modular samples for NetBeans

JavaFX 12 samples to run from NetBeans with different options and build tools

Version NetBeans [11.1](https://netbeans.apache.org/download/nb111/nb111.html)

Download an appropriate [JDK 12](https://jdk.java.net/12/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 12 installation directory. 

The samples assume NetBeans 11 runs on JDK 12 (this can be set editing the `etc/netbeans.conf` file
and setting `netbeans_jdkhome="/path/to/jdk12"`).

Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

### Java

For the first time only:

- Download [JavaFX SDK](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

- Open NetBeans and create a global Library under `NetBeans -> Tools -> Libraries -> New Library`.
Name it `JavaFX12` and include the jars under the lib folder from JavaFX 12 (but not the `src.zip` file).

- Create a global Library under `NetBeans -> Tools -> Libraries -> New Library`.
Name it `JavaFXMODS12` and include the folder JavaFX jmods 12.

Clone the sample, open it with NetBeans, and make sure the paths for Java 12 and 
JavaFX 12 match those on your machine.

Clean and build with regular button to create a custom JRE.
Run with regular button.

To run the custom JRE on Mac:

    dist/jlink/HelloFX/bin/java -m hellofx/org.openjfx.MainApp

To run the custom JRE on Windows:

    dist\jlink\HelloFX\bin\java -m hellofx/org.openjfx.MainApp