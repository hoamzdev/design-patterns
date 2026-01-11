package CreationalPattern.FactoryMethod.C2;

public class MainTest {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();

        logistics = new SeaLogistics();
        logistics.planDelivery();

        logistics = new SkyLogistics();
        logistics.planDelivery();
    }
}
