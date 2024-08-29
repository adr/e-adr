# Allow ADR everywhere

## Considered Options

* Allow everywhere
* Restrict to [TYPE](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/ElementType.html#TYPE)
* Restrict to a subset of possible [ElementTypes](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/ElementType.html)

## Decision Outcome

Chosen option: "Allow everywhere", because this allows the annotation to be present everywhere and this does not restrict the usage by the developer.
