package io.github.adr.embedded;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MADRTest {

    @Test
    void annotationPresent() {
        Class<MADRAnnotationPojoDemoClass> obj = MADRAnnotationPojoDemoClass.class;
        assertTrue(obj.isAnnotationPresent(MADR.class));
    }

    @Test
    void annotationContentsCorrect() {
        Class<MADRAnnotationPojoDemoClass> obj = MADRAnnotationPojoDemoClass.class;
        MADR madr = obj.getAnnotation(MADR.class);

        assertEquals(1, madr.value());
        assertEquals("Implement entire business logic layer as POJO", madr.title());
        assertEquals("Need to select a single consistent ComponentImplementationParadigm' for entire business logic layer", madr.contextAndProblem());
        assertArrayEquals(new String[]{"POJO", "JEE EJB", "Spring Bean"}, madr.alternatives());
        assertEquals("POJO", madr.chosenAlternative());
        assertEquals("Because it is a company-wide policy.", madr.justification());
        assertArrayEquals(new int[]{2, 3}, madr.relatedDecisions());
    }
}
