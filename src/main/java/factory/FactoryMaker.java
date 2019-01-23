package factory;

/**
 * Created by ilkayaktas on 2019-01-23 at 11:01.
 */

public class FactoryMaker {
    public enum HitType{
        BASIC,
        COMPLEX
    }

    public static IHitFactory getFactory(HitType type){
        switch (type){
            case BASIC:
                return new BasicHitFactory();
            case COMPLEX:
                return new ComplexHitFactory();
            default:
                throw new IllegalArgumentException("Unknown factory type: " + type.name() + ". Did you insert your factory?");
        }
    }
}
