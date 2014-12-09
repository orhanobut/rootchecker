#Root Checker

###Introduction
Root checker basically checks the binary files which provides the root privileges in specific paths.

###Add dependency
<pre>
dependencies {
    compile 'com.github.nr4bt:rootchecker:1.0.0-SNAPSHOT@aar'
}
</pre>

###Usage
<pre>
RootChecker.isDeviceRooted(); //returns true or false
</pre>
