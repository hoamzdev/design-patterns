package CreationalPattern.FactoryMethod.C1;

public class MainTest {
    public static void main(String[] args) {
        Candy hardCandy = CandyFactory.getCandy(CandyType.Hard);
        assert hardCandy != null;
        System.out.println(hardCandy.getCandyName());
    Candy none = CandyFactory.getCandy(null);
        System.out.println(none);
}
}