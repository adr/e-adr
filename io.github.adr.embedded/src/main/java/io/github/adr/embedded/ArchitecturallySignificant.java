/*
 * Copyright (c) 2016-2017 Oliver Kopp, Olaf Zimmermann
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   Oliver Kopp, Olaf Zimmermann - initial API and implementation
 */
package io.github.adr.embedded;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

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
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ArchitecturallySignificant {

    public enum QualityAttribute {
        ACCURACY,
        PERFORMANCE,
        MODIFYABILITY,
        MANAGEABILITY,
        EXTENSIBILITY,
        TBC,
        MISC // use ISO 9126 or SEI taxonomy
    }

    public enum ArchitecuralPrinciple {
        LOOSE_COUPLING,
        SEPARATION_OF_CONCERNS,
        TBC,
        NONE // use Eoin Woods keynote from WICSA 2008 as input?
    }

    public enum ArchitecuralStyle {
        SOA,
        MESSAGING,
        CLIENT_SERVER,
        TBC,
        NONE // use Shaw/Garlan books and tbd as taxonomy
    }

    QualityAttribute[] nfrs() default QualityAttribute.MISC;

    ArchitecuralPrinciple[] principles() default {};

    ArchitecuralStyle[] styles() default {};

    String concerns() default "";

}
