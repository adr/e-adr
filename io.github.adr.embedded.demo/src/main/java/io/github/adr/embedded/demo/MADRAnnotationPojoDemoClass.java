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
// import java.util.UUID;

import io.github.adr.embedded.ArchitecturallySignificant;
import io.github.adr.embedded.MADR;

// TODO evaluate repeating annotations, typed annotations, see http://docs.oracle.com/javase/tutorial/java/annotations/basics.html

@ArchitecturallySignificant(concerns = "performance and scalability needs", nfrs = {
    ArchitecturallySignificant.QualityAttribute.PERFORMANCE,
    ArchitecturallySignificant.QualityAttribute.MANAGEABILITY})
@MADR(value = 1,
    title = "Implement entire business logic layer as POJO",
    contextAndProblem = "Need to select a single consistent ComponentImplementationParadigm' for entire business logic layer",
    alternatives = {"POJO", "JEE EJB", "Spring Bean"},
    chosenAlternative = "POJO",
    justification = "Because it is a company-wide policy.",
    relatedDecisions = {2, 3})
public class MADRAnnotationPojoDemoClass {

    public int sampleBusinessLogic(String input) {
        return 42;
    }

}
