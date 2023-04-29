# OpenL Tablet Dojo

Supported Platform
* https://openl-tablets.org/supported-platforms

## Compile Errors


```
Unable to make protected final java.lang.Class java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain) throws java.lang.ClassFormatError accessible: module java.base does not "opens java.lang" to unnamed module @########
```

```
ClassFormatError accessible: module java.base does not "opens java.lang" to unnamed module
```

In the eclipse editor proceed with the following changes:
Run Configuration -> Arguments -> VM Arguments

```
--add-opens=java.base/java.lang=ALL-UNNAMED
--add-opens=java.base/java.util=ALL-UNNAMED
```

Refer to the exception message to enable reflection from one module to another.

Detailed explainations can be found here:
1. https://stackoverflow.com/questions/41265266/how-to-solve-inaccessibleobjectexception-unable-to-make-member-accessible-m
2. https://www.cnblogs.com/stcweb/articles/15114266.html
3. https://www.baeldung.com/java-illegal-reflective-access