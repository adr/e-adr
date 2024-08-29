package io.github.adr.embedded;

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
