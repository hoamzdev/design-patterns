package CreationalPattern.FactoryMethod.C2;

public class Truck implements Transport{

    @Override
    public void deliver() {
        System.out.println("This is truck");
    }
}
