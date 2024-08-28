package io.github.adr.embedded;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface ADRs {
    ADR[] value();
}
