package io.github.adr.embedded;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
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
@Documented
public @interface DecisionMade {

    String id() default "AD-nn";

    String solvedProblem() default "[not yet captured]";

    String chosenOption();

    String rationale() default "[not yet justified]";

    String[] relatedDecisions() default {};
}
