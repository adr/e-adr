package io.github.adr.linked;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(ADRrefs.class)
public @interface ADRref {
    /**
     * The unique identifier of the ADR referenced.
     *
     * Example: <code>AD-framework-001</code>
     *
     * This is required, because {@link ADR} supports numbers only.
     */
    String value();
}
