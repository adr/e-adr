package io.github.adr.embedded;

import java.lang.annotation.*;

// http://docs.oracle.com/javase/tutorial/java/annotations/basics.html
// http://www.mkyong.com/java/java-custom-annotations-example/
// http://tutorials.jenkov.com/java/annotations.html

// annotation processing: http://hannesdorfmann.com/annotation-processing/annotationprocessing101
// https://www.javacodegeeks.com/2015/09/java-annotation-processors.html

@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ArchitecturallySignificant {

    public enum QualityAttribute {
        ACCURACY,
        PERFORMANCE,
        MODIFYABILITY,
        MANAGEABILITY,
        EXTENSIBILITY,
        TBC,
        MISC // use ISO 9126 or SEI taxonomy
    }

    public enum ArchitecuralPrinciple {
        LOOSE_COULING,
        SEPARATION_OF_CONCERNS,
        TBC,
        NONE // use Eoin Woods keynote from WICSA 2008 as input?
    }

    public enum ArchitecuralStyle {
        SOA,
        MESSAGING,
        CLIENT_SERVER,
        TBC,
        NONE // use Shaw/Garlan books and tbd as taxonomy
    }


    QualityAttribute[] nfrs() default QualityAttribute.MISC;

    String concerns() default "";

    // TODO: is this the right place for styler and principle? or should that go to separate annotation?
}
