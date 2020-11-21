# Example: building Hello World in Kotlin, Gradle and KTS

## UberJAR approach

```
./gradlew clean uberJar

cd build/libs
java -jar ./kotlin-hello-world-1.0-SNAPSHOT-uber.jar
```

## Executable starter approach

```
./gradlew clean build

cd build/distributions

tar -xvf ./kotlin-hello-world-1.0-SNAPSHOT.tar

cd kotlin-hello-world-1.0-SNAPSHOT/bin/

./kotlin-hello-world
```

## License | tl;dr: 

> A highly permissive license similar to the MIT License with added features including an explicit patent grant, clear ability to relicense (to commercial, proprietary, copyleft or etc...) and usable as a CLA.  It is compatible with most commercial and copyleft (GPL-family) licenses.

Source:
<https://tldrlegal.com/license/universal-permissive-license-1.0-(upl-1.0)>
