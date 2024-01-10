## Modular samples for NetBeans

JavaFX samples to run from NetBeans with different options and build tools.

Download [JDK 17 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory. 

The samples assume NetBeans 10 runs on JDK 12 (this can be set editing the `etc/netbeans.conf` file
and setting `netbeans_jdkhome="/path/to/jdk12"`).

### Gradle

For the first time only, install manually the Gradle plugin for NetBeans 2.0.2 
from the [GitHub repository](https://github.com/kelemen/netbeans-gradle-project/releases).

Clone the sample, open it with NetBeans. Select the build.gradle file, and build and run
from the tasks in the Navigator window.

Run the `jlink` task to create a custom runtime image:

#### Linux / Mac

On Linux or Mac run:

    build/image/bin/hellofx

#### Windows

On Windows, run:

    build\image\bin\hellofx
