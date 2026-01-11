package CreationalPattern.FactoryMethod.C2;

public class SeaLogistics extends Logistics{

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
