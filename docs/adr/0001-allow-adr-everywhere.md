# Allow ADR everyhwere

## Considered Alternatives

* Allow everywhere
* Restrict to [TYPE](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/ElementType.html#TYPE)
* Restrict to a subeset of possible [ElementTypes](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/ElementType.html)
* [RetentionPolicy.SOURCE](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/RetentionPolicy.html#SOURCE)

## Decision Outcome

* *Chosen Alternative: Allow everywhere*
* This allows the annotation to be present everywhere, because this does not restrict the usage by the developer
