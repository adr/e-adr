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
package io.github.adr.embedded.demo;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.stream.Collectors;

import io.github.adr.embedded.ArchitecturallySignificant;
import io.github.adr.embedded.MADR;

public class MADRAnnotationPojoDemoClassReflection {

    public static void main(String[] args) throws Exception {

        System.out.println("Reflecting...");
        System.out.println();

        Class<MADRAnnotationPojoDemoClass> obj = MADRAnnotationPojoDemoClass.class;

        if (obj.isAnnotationPresent(ArchitecturallySignificant.class)) {
            Annotation annotation = obj.getAnnotation(ArchitecturallySignificant.class);
            ArchitecturallySignificant akmadAnnotation = (ArchitecturallySignificant) annotation;

            System.out.printf("Class is @ArchitecturallySignificant.%nConcerns are: %s%n", akmadAnnotation.concerns());

            System.out.printf("NFRs: %s%n", Arrays.stream(akmadAnnotation.nfrs()).map(e -> e.toString()).collect(Collectors.joining(", ")));
            System.out.printf("Principles: %s%n", Arrays.stream(akmadAnnotation.principles()).map(e -> e.toString()).collect(Collectors.joining(", ")));
            System.out.printf("Styles: %s%n", Arrays.stream(akmadAnnotation.styles()).map(e -> e.toString()).collect(Collectors.joining(", ")));
            System.out.println();
        }

        if (obj.isAnnotationPresent(MADR.class)) {
            MADR[] madrAnnotations = obj.getAnnotationsByType(MADR.class);
            for (MADR madrAnnotation : madrAnnotations) {
                System.out.printf("Decision id: %s%n", madrAnnotation.value());
                System.out.printf("User story: %s%n", madrAnnotation.userStory().isEmpty() ? "none" : madrAnnotation.userStory());
                System.out.printf("Context and problem: %s%n", madrAnnotation.contextAndProblem());
                System.out.printf("Options: %s%n", getPrintableVersion(madrAnnotation.alternatives()));
                System.out.printf("Chosen alternative: %s%n", madrAnnotation.chosenAlternative());
                System.out.printf("Justification: %s%n", madrAnnotation.justification());
                System.out.printf("Consequences: %s%n", getPrintableVersion(madrAnnotation.consequences()));

                if (madrAnnotation.relatedDecisions().length == 0) {
                    System.out.printf("Related decisions: none%n");
                } else {
                    String relatedDecisions = Arrays.stream(madrAnnotation.relatedDecisions())
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining("\n- ", "- ", ""));
                    System.out.printf("Related decisions: %n%s%n", relatedDecisions);
                }
            }
        }
    }

    private static String getPrintableVersion(String[] strings) {
        String string = Arrays.stream(strings).collect(Collectors.joining(", "));
        if (string.isEmpty()) {
            string = "none";
        }
        return string;
    }
}
