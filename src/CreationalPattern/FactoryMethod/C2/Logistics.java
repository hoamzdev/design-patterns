package CreationalPattern.FactoryMethod.C2;

public abstract class Logistics {

    //Factory Method
    abstract Transport createTransport();

    //method : hanh vi
    public void planDelivery(){
        Transport transport = createTransport();
        transport.deliver();
    }
}
