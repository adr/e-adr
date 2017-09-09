package io.github.adr.embedded.demo;

import java.lang.annotation.Annotation;

import io.github.adr.embedded.ArchitecturallySignificant;
import io.github.adr.embedded.DecisionMade;

public class ADAnnotationDemoClassReflection {

    public static void main(String[] args) throws Exception {

        System.out.println("Reflecting...");

        Class<ADAnnotationDemoClass> obj = ADAnnotationDemoClass.class;

        if (obj.isAnnotationPresent(ArchitecturallySignificant.class)) {

            Annotation annotation = obj.getAnnotation(ArchitecturallySignificant.class);
            ArchitecturallySignificant akmadAnnotation = (ArchitecturallySignificant) annotation;

            System.out.printf("%nClass is @ArchitecturallySignificant. Concerns are: %s", akmadAnnotation.concerns());
            // TODO print out NFR array
        }

        if (obj.isAnnotationPresent(DecisionMade.class)) {

            Annotation annotation = obj.getAnnotation(DecisionMade.class);
            DecisionMade akmadAnnotation = (DecisionMade) annotation;

            System.out.printf("%nDecision id : " + akmadAnnotation.id());
            System.out.printf("%nIssue: %s", akmadAnnotation.solvedProblem());
            System.out.printf("%nOutcome: %s", akmadAnnotation.chosenOption());
            System.out.printf("%nJustification: %s", akmadAnnotation.rationale());

            int relDDCount = akmadAnnotation.relatedDecisions().length;
            for (int i = 0; i < relDDCount; i++) {
                System.out.printf("%nRelated decisions: %s", akmadAnnotation.relatedDecisions()[i]);
            }
            /*
            int negAltCount = akmadAnnotation.neglectedAlternatives().length;
            for(int i=0;i<negAltCount; i++) {
            	System.out.printf("%nNeglected alternative: %s", akmadAnnotation.neglectedAlternatives()[i]);
            }
            */
        }
    }
}
