# Embedded Architectural Decision Records

[![Build Status](https://travis-ci.org/adr/e-adr.svg?branch=master)](https://travis-ci.org/adr/e-adr)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.adr/e-adr/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.adr/e-adr)
[![Javadocs](http://javadoc.io/badge/io.github.adr/e-adr.svg)](http://javadoc.io/doc/io.github.adr/e-adr)
[![License](https://img.shields.io/badge/license-EPL-blue.svg)](LICENSE.md)

We believe that [architectural decisions](https://en.wikipedia.org/wiki/Architectural_decision) are important for an success of a project.
Maintaining external documentation is cumbersome and it may get out of sync.
Using **embedded architectural decision records** allows to embed architectural decisions in Java code.

Currently, following architectural decision records are supported:

- Y-Statements - [Sustainable Architectural Decision Records](https://www.infoq.com/articles/sustainable-architectural-design-decisions)
- [Markdown Architectural Decision Records](https://github.com/adr/madr) ("MADR") - lean architecture decision records using markdown.


## Examples

### Example for a linked ADR

```java
@ADR(1)
public class MADRAnnotationDemoClass {
    public int sampleBusinessLogic(String input) {
        return 42;
    }
}
```

### Example for complete embedding

```java
@MADR(value = 1,
    title = "Implement entire business logic layer as POJO",
    contextAndProblem = "Need to select a single consistent ComponentImplementationParadigm' for entire business logic layer",
    alternatives = {"POJO", "JEE EJB", "Spring Bean"},
    chosenAlternative = "POJO",
    justification = "Because it is a company-wide policy, see http://www.iaas.uni-stuttgart.de/institut/ehemalige/zimmermann/indexE.php",
    relatedDecisions = {2, 3})
public class MADRAnnotationDemoClass {
    public int sampleBusinessLogic(String input) {
        return 42;
    }
}
```


<!--
Architectural knowledge captured in architectural designs and decisions is primarily created and consumed in tools made for software architects.
Developers, also consuming and creating architectural knowledge, do not always use such tools;
this adds to the gap between these two roles often observed in practice.
Architectural erosion and knowledge vaporization are two of the consequences.

With this repository, we show how to narrow the gap with architecture domain-specific Java annotations.
These annotations allow developers to reference and create architectural decision knowledge directly in code.
This knowledge can then automatically be processed by other tools to provide additional integration and collaboration capabilities.
-->


See <https://adr.github.io> for more information on ADRs.


## Development information

`gradlew assemble` requires the upload to maven central configured properly.
Thus, please use `gradlew jar` to generate the jar.
