# My OSS Project

An open-source project bootstrapped using the [ModiTect OSS Quickstart](https://github.com/moditect/oss-quickstart) archetype.


Run the following command to build this project:

```
mvn clean verify
```

Pass the `-Dquick` option to skip all non-essential plug-ins and create the output artifact as quickly as possible:

```
mvn clean verify -Dquick
```

Run the following command to format the source code and organize the imports as per the project's conventions:

```
mvn process-sources
```

Maven failsafe plugin has been integrated into the code base.
To run the failsafe integration tests run the command:

```
mvn verify -P failsafe
```

This code base is available under the Apache License, version 2.
