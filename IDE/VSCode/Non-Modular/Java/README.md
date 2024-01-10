## Non-modular samples for Visual Studio Code

JavaFX 17 samples to run from Visual Studio Code with different options and build tools.

Version Visual Studio Code: 1.63.0 or higher.

Download [JDK 17 or later](http://jdk.java.net/) for your operating system. Make sure `JAVA_HOME` is properly set to the JDK installation directory.

### Java

For the first time only:

- Download [JavaFX SDK](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

- Make sure you have the [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) installed in your Visual Studio Code.

- Clone the sample, open the folder `hellofx` in Visual Studio Code. Open any of the Java file to import the project.

- Open `.vscode/settings.json`, replace the `<JavaFX_lib_path>` to you JavaFX lib folder.

- Open `.vscode/launch.json`, replace the `<JavaFX_lib_path>` to you JavaFX lib folder.

#### Run the JavaFX Application

To run the JavaFX Application, open left side `Run and Debug` panel -> `Launch App`.
