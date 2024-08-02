public class Prism extends Block {
    private double a; //délka strany
    private double b; //šířka strany
    public Prism (Colour colour, Type type, double a, double b) {
        super(colour, type);
        this.a = a;
        this.b = b;
    }
    @Override
    public double getVolume() {
        return a*a*b;
    }

    @Override
    public double getSurfaceArea() {
        return (2*a*a)+(4*a*b);
    }
}
