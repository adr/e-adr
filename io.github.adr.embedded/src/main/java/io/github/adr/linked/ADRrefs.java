package io.github.adr.linked;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Required for <code>@Repeatable</code> at {@link ADRref}.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ADRrefs {
    ADRref[] value();
}
