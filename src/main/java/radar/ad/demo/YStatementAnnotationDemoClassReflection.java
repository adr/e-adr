package radar.ad.demo;

import java.lang.annotation.Annotation;

import radar.ad.annotations.ArchitecturallySignificant;
import radar.ad.annotations.YStatementJustification;

public class YStatementAnnotationDemoClassReflection {

    public static void main(String[] args) throws Exception {

        Class<YStatementAnnotationDemoClass> obj = YStatementAnnotationDemoClass.class;

        if (obj.isAnnotationPresent(ArchitecturallySignificant.class)) {

            Annotation annotation = obj.getAnnotation(ArchitecturallySignificant.class);
            ArchitecturallySignificant akmadAnnotation = (ArchitecturallySignificant) annotation;

            System.out.printf("%nClass is @ArchitecturallySignificant. Concerns are: %s", akmadAnnotation.concerns());
        }

        if (obj.isAnnotationPresent(YStatementJustification.class)) {

            Annotation annotation = obj.getAnnotation(YStatementJustification.class);
            YStatementJustification akmadAnnotation = (YStatementJustification) annotation;

            System.out.println("Decision id: " + akmadAnnotation.id());
            System.out.print(akmadAnnotation.context());
            System.out.println(", " + akmadAnnotation.facing() + ", ");
            System.out.print(akmadAnnotation.chosen());
            System.out.println(akmadAnnotation.neglected());
            System.out.println(akmadAnnotation.achieving());
            System.out.println(akmadAnnotation.accepting());
        }
    }
}
