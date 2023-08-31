## Modular samples for NetBeans

JavaFX samples to run from NetBeans with different options and build tools.

Download [JDK 17 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory. 

Download [JavaFX jmods](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

### Java

For the first time only:

- Download [JavaFX SDK](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

- Open NetBeans and create a global Library under `NetBeans -> Tools -> Libraries -> New Library`.
Name it `JavaFXSDK` and include the jars under the lib folder from JavaFX (but not the `src.zip` file).

- Create a global Library under `NetBeans -> Tools -> Libraries -> New Library`.
Name it `JavaFXMODS` and include the folder JavaFX jmods.

Clone the sample, open it with NetBeans, and make sure the paths for JDK and JavaFX match those on your machine.

Clean and build with regular button to create a custom JRE.
Run with regular button.

To run the custom JRE on Mac:

    dist/jlink/HelloFX/bin/java -m hellofx/org.openjfx.MainApp

To run the custom JRE on Windows:

    dist\jlink\HelloFX\bin\java -m hellofx/org.openjfx.MainApp