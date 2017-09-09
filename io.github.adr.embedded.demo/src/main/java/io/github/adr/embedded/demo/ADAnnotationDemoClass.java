package io.github.adr.embedded.demo;
// import java.util.UUID;

import io.github.adr.embedded.ArchitecturallySignificant;
import io.github.adr.embedded.DecisionMade;

// TODO evaluate repeating annotations, typed annotations, see http://docs.oracle.com/javase/tutorial/java/annotations/basics.html

@ArchitecturallySignificant(concerns = "performance and scalability needs", nfrs = {
        ArchitecturallySignificant.QualityAttribute.PERFORMANCE,
        ArchitecturallySignificant.QualityAttribute.MANAGEABILITY})
// @formatter:off
@DecisionMade(id = "AD-001",
        solvedProblem = "Need to select a single consistent ComponentImplementationParadigm' for entire business logic layer",
        chosenOption = "Decided to implement business logic as a 'POJO' (and not as a framework component such as 'JEE EJB' or 'SpringBean')",
        // neglectedAlternatives={"JEE EJB", "Spring bean"},
        rationale = "because it is a company-wide policy, see http://www.iaas.uni-stuttgart.de/institut/ehemalige/zimmermann/indexE.php",
        relatedDecisions = {"AD-002", "AD-003"})
//@formatter:on
public class ADAnnotationDemoClass {

    @DecisionMade(id = "AD-002", solvedProblem = "tbd", chosenOption = "tbd")
    public int sampleBusinessLogic(String input) {
        return 42;
    }
}
