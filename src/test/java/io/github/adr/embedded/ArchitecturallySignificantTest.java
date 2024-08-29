package io.github.adr.embedded;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArchitecturallySignificantTest {

    @Test
    void annotationPresent() {
        Class<ArchitecturallySignificantDemoClass> obj = ArchitecturallySignificantDemoClass.class;
        assertTrue(obj.isAnnotationPresent(ArchitecturallySignificant.class));
    }

    @Test
    void annotationContentsCorrect() {
        Class<ArchitecturallySignificantDemoClass> obj = ArchitecturallySignificantDemoClass.class;
        ArchitecturallySignificant akmadAnnotation = obj.getAnnotation(ArchitecturallySignificant.class);
        assertEquals("performance and scalability needs", akmadAnnotation.concerns());
        assertEquals(Arrays.asList(
                ArchitecturallySignificant.QualityAttribute.PERFORMANCE,
                ArchitecturallySignificant.QualityAttribute.MANAGEABILITY),
            Arrays.asList(akmadAnnotation.nfrs()));
    }
}
