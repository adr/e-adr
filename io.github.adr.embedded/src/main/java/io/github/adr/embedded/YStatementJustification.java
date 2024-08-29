package io.github.adr.embedded;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import io.github.adr.linked.ADR;

/**
 * See <a href="https://www.infoq.com/articles/sustainable-architectural-design-decisions">IEEE Software/InfoQ article</a> and
 * <a href="https://www.ifs.hsr.ch/fileadmin/user_upload/customers/ifs.hsr.ch/Home/projekte/ZIO-WFADSoftwareforenAGSWAAT8Nov2014v10p.pdf">SATURN 2012 presentation</a> for introduction of Y statements.
 * More information is also given in the AppArch lecture at <a href="https://www.ifs.hsr.ch/">HSR FHO</a>.
 *
 * TODO decide where to put the Y statement template text - defaults? IO helper? ...?
 */
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
@Retention(RetentionPolicy.SOURCE)
@Documented
@Repeatable(YStatementJustifications.class)
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
