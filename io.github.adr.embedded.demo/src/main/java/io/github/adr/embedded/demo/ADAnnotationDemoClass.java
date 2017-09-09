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
import io.github.adr.embedded.DecisionMade;

// TODO evaluate repeating annotations, typed annotations, see http://docs.oracle.com/javase/tutorial/java/annotations/basics.html

@ArchitecturallySignificant(concerns = "performance and scalability needs", nfrs = {
        ArchitecturallySignificant.QualityAttribute.PERFORMANCE,
        ArchitecturallySignificant.QualityAttribute.MANAGEABILITY})
@DecisionMade(id = "AD-001",
        solvedProblem = "Need to select a single consistent ComponentImplementationParadigm' for entire business logic layer",
        chosenOption = "Decided to implement business logic as a 'POJO' (and not as a framework component such as 'JEE EJB' or 'SpringBean')",
        // neglectedAlternatives={"JEE EJB", "Spring bean"},
        rationale = "because it is a company-wide policy, see http://www.iaas.uni-stuttgart.de/institut/ehemalige/zimmermann/indexE.php",
        relatedDecisions = {"AD-002", "AD-003"})
public class ADAnnotationDemoClass {

    @DecisionMade(id = "AD-002", solvedProblem = "tbd", chosenOption = "tbd")
    public int sampleBusinessLogic(String input) {
        return 42;
    }
}
