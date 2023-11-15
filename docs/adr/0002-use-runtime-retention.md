# Use Runtime Retention for the Annotations

Which retention policy to use for `@ADR` annotations?

## Considered Alternatives

- [RetentionPolicy.RUNTIME](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/RetentionPolicy.html#RUNTIME)
- [RetentionPolicy.CLASS](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/RetentionPolicy.html#CLASS)
- [RetentionPolicy.SOURCE](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/RetentionPolicy.html#SOURCE)

## Decision Outcome

- *Chosen Alternative: RetentionPolicy.RUNTIME*
- This allows the annotation to be processed both at compilation and runtime.

Further reading

- <http://docs.oracle.com/javase/tutorial/java/annotations/basics.html>
- <http://www.mkyong.com/java/java-custom-annotations-example/>
- [tutorials.jenkov.com/java/annotations.html (archive.org)](https://web.archive.org/web/20220705011218/https://jenkov.com/tutorials/java/annotations.html)
- annotation processing:
  - <http://hannesdorfmann.com/annotation-processing/annotationprocessing101>
  - <https://www.javacodegeeks.com/2015/09/java-annotation-processors.html>
