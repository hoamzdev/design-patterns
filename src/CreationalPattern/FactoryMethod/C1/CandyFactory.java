package CreationalPattern.FactoryMethod.C1;

public class CandyFactory {
    public static Candy getCandy(CandyType type){
        if(type == CandyType.Hard) return new HardCandy();
        else if(type == CandyType.Minty) return  new MintyCandy();
        return null;
    }
}
