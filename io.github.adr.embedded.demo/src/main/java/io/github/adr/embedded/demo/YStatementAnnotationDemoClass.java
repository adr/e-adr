package io.github.adr.embedded.demo;
// import java.util.UUID;

import io.github.adr.embedded.YStatementJustification;

//@formatter:off
@YStatementJustification(
        chosen = "we decided to implement business logic in POJOs",
        neglected = "other options such as JEE EJBs and Spring components")
//@formatter:on
public class YStatementAnnotationDemoClass {

    public int sampleBusinessLogic(String input) {
        return 42;
    }
}
