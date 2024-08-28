package io.github.adr.embedded;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@ADR(2)
@Retention(RetentionPolicy.SOURCE)
@Documented
@Repeatable(ADRs.class)
public @interface ADR {

    /**
     * The number part of the ADR. For instance, 1 gets expanded to the full id <code>ADR-0001</code>.
     *
     * @return Number of the ADR
     */
    int value();
}
