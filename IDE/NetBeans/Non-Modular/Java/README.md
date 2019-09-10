## Non-modular samples for NetBeans

JavaFX 13 samples to run from NetBeans with different options and build tools

Version NetBeans [11.1](https://netbeans.apache.org/download/nb111/nb111.html)

Download [JDK 11 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory. 

The samples assume NetBeans 11 runs on JDK 12 (this can be set editing the `etc/netbeans.conf` file
and setting `netbeans_jdkhome="/path/to/jdk12"`).

### Java

For the first time only:

- Download [JavaFX SDK](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

- Open NetBeans and create a global Library under `NetBeans -> Tools -> Libraries -> New Library`.
Name it `JavaFX13` and include the jars under the lib folder from JavaFX 13 (but not the `src.zip` file).

Clone the sample, open it with NetBeans, and make sure the paths for JDK and JavaFX match those on your machine.