# Embedded Architectural Decision Records

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.adr/e-adr/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.adr/e-adr)
[![Javadocs](https://javadoc.io/badge/io.github.adr/e-adr.svg)](https://javadoc.io/doc/io.github.adr/e-adr)
[![License](https://img.shields.io/badge/license-EPL-blue.svg)](LICENSE)

> Architectural knowledge captured in architectural designs and [architectural decisions](https://en.wikipedia.org/wiki/Architectural_decision) is primarily created and consumed in tools made for software architects.
> Developers, also consuming and creating architectural knowledge, do not always use such tools;
> this adds to the gap between these two roles often observed in practice.
> Architectural erosion and knowledge vaporization are two of the consequences.

With this repository, we show how to narrow the gap with architecture domain-specific Java annotations.
These annotations allow developers to reference and create architectural decision knowledge directly in code.
This knowledge can then automatically be processed by other tools to provide additional integration and collaboration capabilities.

Currently, following architectural decision records are supported:

- Y-Statements - [Sustainable Architectural Decision Records](https://www.infoq.com/articles/sustainable-architectural-design-decisions)
- [Markdown Architectural Decision Records](https://github.com/adr/madr) ("MADR") - lean architecture decision records using markdown.

See <https://adr.github.io> for more information on architectural decision records.

## Examples

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

`@MADR` indicates that the annotation used the format defined by the "Markdown Architectural Decision Record".
The content is directly embedded in the annotation.

### Example for a linked ADR

```java
@ADR(1)
public class MADRAnnotationDemoClass {
    public int sampleBusinessLogic(String input) {
        return 42;
    }
}
```

By using `@ADR(1)`, the annotation points to `ADR 0001`.
The convetion is that the decisions are stored in `docs/adr/` with a running number.
They can be of an arbirary format, such as MADR or [Michael Nygard's format](http://thinkrelevance.com/blog/2011/11/15/documenting-architecture-decisions), which is supported by [adr-tools](https://github.com/npryce/adr-tools).
Example MADRs can be seen at the [ADR log of the adr-log tool](https://github.com/adr/adr-log/blob/master/docs/adr/index.md).

## Use in your projects

Gradle:

```groovy
implementation 'io.github.adr:e-adr:1.0.0'
```

Maven:

```xml
<dependency>
  <groupId>io.github.adr</groupId>
  <artifactId>e-adr</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Development information

`gradlew assemble` requires the upload to maven central configured properly.
Thus, please use `gradlew jar` to generate the jar.

## Related work

- [Documenting Implementation Decisions with Code Annotations](https://www.researchgate.net/publication/280014035_Documenting_Implementation_Decisions_with_Code_Annotations)
  - Uses JavaDoc
  - Requires external tool to allow for auto completion
