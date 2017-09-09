package io.github.adr.embedded;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({
    ElementType.ANNOTATION_TYPE,
    ElementType.CONSTRUCTOR,
    ElementType.FIELD,
    ElementType.LOCAL_VARIABLE,
    ElementType.METHOD,
    ElementType.PACKAGE,
    ElementType.PARAMETER,
    ElementType.TYPE,
    ElementType.TYPE_PARAMETER,
    ElementType.TYPE_USE})
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
