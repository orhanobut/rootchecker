#Root Checker
Root checker basically checks your device whether it is rooted or not.

###Add dependency
```groovy
repositories {
    maven { url "https://oss.sonatype.org/content/repositories/snapshots/"}
}
dependencies {
    compile 'com.orhanobut:rootchecker:1.0.0-SNAPSHOT@aar'
}
```

###Usage
```java
RootChecker.isDeviceRooted(); //returns true or false
```
