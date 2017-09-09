package io.github.adr.embedded;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
// allow it everywhere (see https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/ElementType.html), because we do not want to restrict the usage
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
