# Kotlin Script Starter

There are some problems with launching scripts that are written in Kotlin today.
This project helps you to avoid tricky and non-obvious problems that you could face.

## Import and build
Import project as gradle project in your IDE and use UI.
Or use command line with gradle-wrapper:
```
./gradlew clean build
```

## Write your own scripts
All scripts should be written in `scripts` folder. 
You could use another or additional folders after changing following section in `build.gradle`:
```
processResources {
    from 'src/main/kotlin/scripts' //change here
    //or add another one
}
```
Kotlin scripts should have `.kts` extension. For example `hello.kts`.

## Launch scripts
You could launch your scripts with IDE as general Kotlin app. Use ConsoleExecutor class for it.
In program arguments you should provide name of script without extension as the first argument:

```
./gradlew run -Dexec.args="<script_name_wo_dotkts>"
```

Launch the example script `hello.kts`:

```
./gradlew run -Dexec.args="hello"
```

Or you could build docker image:
```
./gradlew dockerBuildImage
```
and launch it:
```
docker run --rm -it info.developerblog/kotlin-script-starter:0.0.1 <script_name>
```
