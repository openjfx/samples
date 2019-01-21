## Non-modular samples for NetBeans

JavaFX 11 samples to run from NetBeans with different options and build tools

Version NetBeans [10.0](https://netbeans.apache.org/download/nb100/nb100.html)

Download an appropriate [JDK 11](https://jdk.java.net/11/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

The samples assume NetBeans 10 runs on JDK 11 (this can be set editing the `etc/netbeans.conf` file
and setting `netbeans_jdkhome="/path/to/jdk11"`).

### Gradle

For the first time only:

- Install manually the Gradle plugin for NetBeans 2.0.2 from the 
[GitHub repository](https://github.com/kelemen/netbeans-gradle-project/releases).

Clone the sample, open it with NetBeans and reload the project. Build and run
from the Tasks context-menu.