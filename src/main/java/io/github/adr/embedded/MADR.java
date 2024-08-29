package io.github.adr.embedded;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import io.github.adr.linked.ADR;

@ADR(1)
@Target({
    ElementType.ANNOTATION_TYPE,
    ElementType.CONSTRUCTOR,
    ElementType.FIELD,
    ElementType.LOCAL_VARIABLE,
    ElementType.METHOD,
    ElementType.PACKAGE,
    ElementType.PARAMETER,
    ElementType.TYPE,
    ElementType.TYPE_PARAMETER,
    ElementType.TYPE_USE})
@ADR(2)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(MADRs.class)
public @interface MADR {

    /**
     * The number part of the ADR. For instance, 1 gets expanded to the full id <code>ADR-0001</code>.
     *
     * @return The number of the ADR
     */
    int value();

    /**
     * Short title of solved problem and solution
     *
     * @return title
     */
    String title();

    /**
     * The user story belonging to this ADR. Typically, a reference to the ticket in the issue tracker.
     *
     * @return User story as reference.
     */
    String userStory() default "";

    /**
     * @return Context and problem statement
     */
    String contextAndProblem();

    /**
     * Considered alternatives. May be omitted if {@link Alternative} annotations are used.
     *
     * @return Considered alternatives
     */
    String[] alternatives() default {};

    /**
     * The chosen alternative. Invariant: alternatives().contains(chosenAlternative())
     *
     * @return Chosen alternative
     */
    String chosenAlternative();

    /**
     * @return Justification. e.g., only alternative, which meets k.o. criterion decision driver | which resolves force | ... | comes out best (see below)
     */
    String justification();

    /**
     * @return Consequences. e.g., negative impact on quality attribute, follow-up decisions required, ...
     */
    String[] consequences() default {};

    /**
     * Decisions being related to this decision.
     *
     * @return the ids of related decisions
     */
    int[] relatedDecisions() default {};
}
