# samples

JavaFX 11 samples to run with different options and build tools.

Download an appropriate [JDK 11](https://jdk.java.net/11/) for your operating system. Make sure `JAVA_HOME` 
is properly set to the Java 11 installation directory. 

Download [JavaFX SDK](https://gluonhq.com/products/javafx/) for your operating 
system and unzip to a desired location.

## Non-modular - CLI

`hellofx` sample non-modular project to run on command line, without build tools

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd CommandLine/Non-modular/CLI/hellofx
    export PATH_TO_FX=path/to/javafx-sdk-11/lib
    javac --module-path $PATH_TO_FX --add-modules=javafx.controls -d out $(find src -name "*.java")
    
To run the project:
    
    java --module-path $PATH_TO_FX --add-modules=javafx.controls -cp out hellofx.HelloFX

To create a fat jar:

    find $PATH_TO_FX/{javafx.base.jar,javafx.graphics.jar,javafx.controls.jar} -exec unzip -nq {} -d out \;

    #uncomment for Linux:
    #cp $PATH_TO_FX/{libprism*.so,libjavafx*.so,libglass*.so,libdecora_sse.so} out

    #uncomment for Mac:
    #cp $PATH_TO_FX/{libprism*.dylib,libjavafx*.dylib,libglass.dylib,libdecora_sse.dylib} out

    rm out/META-INF/MANIFEST.MF out/module-info.class
    mkdir libs
    jar --create --file=libs/hellofx.jar --main-class=hellofx.Launcher -C out .
    java -jar libs/hellofx.jar


### Windows

If you run on Windows, follow these steps:

    cd CommandLine\Non-modular\CLI\hellofx
    set PATH_TO_FX="path\to\javafx-sdk-11\lib"
    dir /s /b src\*.java > sources.txt & javac --module-path %PATH_TO_FX% --add-modules=javafx.controls -d out @sources.txt & del sources.txt

To run the project:
    
    java --module-path %PATH_TO_FX% --add-modules=javafx.controls -cp out hellofx.HelloFX

To create a fat jar:

    cd out & jar xf "%PATH_TO_FX%\javafx.base.jar" & jar xf "%PATH_TO_FX%\javafx.graphics.jar" & jar xf "%PATH_TO_FX%\javafx.controls.jar" & cd ..
    copy "%PATH_TO_FX%\..\bin\prism*.dll" out & copy "%PATH_TO_FX%\..\bin\javafx*.dll" out & copy "%PATH_TO_FX%\..\bin\glass.dll" out && copy "%PATH_TO_FX%\..\bin\decora_sse.dll" out
    del out\META-INF\MANIFEST.MF & del out\module-info.class
    mkdir libs
    jar --create --file=libs/hellofx.jar --main-class=hellofx.Launcher -C out .
    java -jar libs\hellofx.jar

