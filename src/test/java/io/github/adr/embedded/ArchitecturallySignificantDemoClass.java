package io.github.adr.embedded;

@ArchitecturallySignificant(concerns = "performance and scalability needs", nfrs = {
    ArchitecturallySignificant.QualityAttribute.PERFORMANCE,
    ArchitecturallySignificant.QualityAttribute.MANAGEABILITY})
public class ArchitecturallySignificantDemoClass {
    public int sampleBusinessLogic(String input) {
        return 42;
    }
}
