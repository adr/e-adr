package radar.ad.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
// @Target({ElementType.TYPE})
@Inherited
@Documented
public @interface DecisionMade {

    String id() default "AD-nn";

    String solvedProblem() default "[not yet captured]";

    String chosenOption();

    String rationale() default "[not yet justified]";

    String[] relatedDecisions() default {};
}
