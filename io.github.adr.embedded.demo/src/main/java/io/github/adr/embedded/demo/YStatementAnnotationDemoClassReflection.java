/*
 * Copyright (c) 2016-2017 Oliver Kopp, Olaf Zimmermann
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Oliver Kopp, Olaf Zimmermann - initial API and implementation
 */
package io.github.adr.embedded.demo;

import java.lang.annotation.Annotation;

import io.github.adr.embedded.ArchitecturallySignificant;
import io.github.adr.embedded.YStatementJustification;

public class YStatementAnnotationDemoClassReflection {

    public static void main(String[] args) throws Exception {

        Class<YStatementAnnotationDemoClass> obj = YStatementAnnotationDemoClass.class;

        if (obj.isAnnotationPresent(ArchitecturallySignificant.class)) {

            Annotation annotation = obj.getAnnotation(ArchitecturallySignificant.class);
            ArchitecturallySignificant akmadAnnotation = (ArchitecturallySignificant) annotation;

            System.out.printf("%nClass is @ArchitecturallySignificant. Concerns are: %s", akmadAnnotation.concerns());
        }

        if (obj.isAnnotationPresent(YStatementJustification.class)) {

            Annotation annotation = obj.getAnnotation(YStatementJustification.class);
            YStatementJustification akmadAnnotation = (YStatementJustification) annotation;

            System.out.println("Decision id: " + akmadAnnotation.id());
            System.out.print(akmadAnnotation.context());
            System.out.println(", " + akmadAnnotation.facing() + ", ");
            System.out.print(akmadAnnotation.chosen());
            System.out.println(akmadAnnotation.neglected());
            System.out.println(akmadAnnotation.achieving());
            System.out.println(akmadAnnotation.accepting());
        }
    }
}
