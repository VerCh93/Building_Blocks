public class Cube extends Block {
    private double a; //strana krychle
    public Cube(Colour colour, Type type, double a) {
        super(colour, type);
        this.a = a;
    }
    @Override
    public double getVolume() {
        return Math.pow(a, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 6*a*a;
    }
}
