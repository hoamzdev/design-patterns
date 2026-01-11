package CreationalPattern.FactoryMethod.C2;

public class Ship implements Transport{

    @Override
    public void deliver() {
        System.out.println("This is ship");
    }
}
