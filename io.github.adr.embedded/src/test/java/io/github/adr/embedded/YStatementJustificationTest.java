package io.github.adr.embedded;

import java.lang.annotation.Annotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YStatementJustificationTest {

    @Test
    void annotationPresent() {
        Class<YStatementAnnotationDemoClass> obj = YStatementAnnotationDemoClass.class;
        assertTrue(obj.isAnnotationPresent(YStatementJustification.class));
    }

    @Test
    void annotationContentsCorrect() {
        Class<YStatementAnnotationDemoClass> obj = YStatementAnnotationDemoClass.class;
        YStatementJustification akmadAnnotation = obj.getAnnotation(YStatementJustification.class);

        assertEquals("AD-xx", akmadAnnotation.id());
        assertEquals("In the context of [functional requirement and current design stage/evolution state]", akmadAnnotation.context());
        assertEquals("facing [non-functional requirements such as quality attributes and constraints]", akmadAnnotation.facing());
        assertEquals("we decided to implement business logic in POJOs", akmadAnnotation.chosen());
        assertEquals("other options such as JEE EJBs and Spring components", akmadAnnotation.neglected());
        assertEquals("to achieve [positive consequences of chosen solution (quality attribute fulfillmment?)]", akmadAnnotation.achieving());
        assertEquals("accepting that [negative consequences of chosen solution (quality attribute impact?)]", akmadAnnotation.accepting());
    }
}
