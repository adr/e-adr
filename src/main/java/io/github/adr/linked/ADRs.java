package io.github.adr.linked;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Required for <code>@Repeatable</code> at {@link ADR}.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ADRs {
    ADR[] value();
}
