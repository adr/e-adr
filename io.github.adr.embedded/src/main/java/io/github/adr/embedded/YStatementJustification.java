package io.github.adr.embedded;

import java.lang.annotation.*;

// TODO decide where to put the Y statement template text - defaults? IO helper? ...?
// see IEEE SOftware/InfoQ article and SATURN 2012 presentation for introduction of Y statements (as well as AppArch lecture at HSR FHO)
// http://www.ifs.hsr.ch/Method-Selection-and-Tailoring.13195.0.html?&L=4

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
public @interface YStatementJustification {

    String id() default "AD-xx";

    String context() default "In the context of [functional requirement and current design stage/evolution state]";

    String facing() default "facing [non-functional requirements such as quality attributes and constraints]";

    String chosen() default "we decided for [selected solution option]";

    String neglected() default "and neglected [alternate solution options]";

    String achieving() default "to achieve [positive consequences of chosen solution (quality attribute fulfillmment?)]";

    String accepting() default "accepting that [negative consequences of chosen solution (quality attribute impact?)]";

    String moreInformation() default ""; // this could take URI
}
