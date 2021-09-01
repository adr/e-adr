/*
 * Copyright (c) 2017-2021 Oliver Kopp, Olaf Zimmermann
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
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ADR(1)
@MADR(
    value = 2,
    title = "Use Runtime Retention for the Annotations",
    contextAndProblem = "Which retention policy to use for `@ADR` annotations?",
    alternatives = {
        "[RetentionPolicy.RUNTIME](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/RetentionPolicy.html#RUNTIME)",
        "[RetentionPolicy.CLASS](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/RetentionPolicy.html#CLASS)",
        "[RetentionPolicy.SOURCE](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/RetentionPolicy.html#SOURCE)"
    },
    chosenAlternative = "RetentionPolicy.RUNTIME",
    justification = "This allows the annotation to be processed both at compilation and runtime.\n\n" +
        "Further reading\n" +
        "\n" +
        "- http://docs.oracle.com/javase/tutorial/java/annotations/basics.html\n" +
        "- http://www.mkyong.com/java/java-custom-annotations-example/\n" +
        "- http://tutorials.jenkov.com/java/annotations.html\n" +
        "- annotation processing: \n" +
        "  - http://hannesdorfmann.com/annotation-processing/annotationprocessing101\n" +
        "  - https://www.javacodegeeks.com/2015/09/java-annotation-processors.html\n"
)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(ADRs.class)
public @interface ADR {

    /**
     * The number part of the of the ADR. For instance, 1 gets expanded to the full id <code>ADR-0001</code>.
     *
     * @return Number of the ADR
     */
    int value();

}
