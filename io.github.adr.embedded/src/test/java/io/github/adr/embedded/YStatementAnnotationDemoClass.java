package io.github.adr.embedded;
// import java.util.UUID;

@YStatementJustification(
        chosen = "we decided to implement business logic in POJOs",
        neglected = "other options such as JEE EJBs and Spring components")
public class YStatementAnnotationDemoClass {

    public int sampleBusinessLogic(String input) {
        return 42;
    }
}
