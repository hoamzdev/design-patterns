package CreationalPattern.FactoryMethod.C2;

public class Plane implements Transport{

    @Override
    public void deliver() {
        System.out.println("This is plane");
    }
}
