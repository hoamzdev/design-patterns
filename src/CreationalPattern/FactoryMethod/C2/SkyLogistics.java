package CreationalPattern.FactoryMethod.C2;

public class SkyLogistics extends Logistics{

    @Override
    protected Transport createTransport() {
        return new Plane();
    }
}
