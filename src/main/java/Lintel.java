public class Lintel extends Block {
    private double a; //délka strany
    private double b; //šířka strany
    private double c; //výška strany

    public Lintel(Colour colour, Type type, double a, double b, double c) {
        super(colour, type);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getVolume() {
        return a*b*c;
    }

    @Override
    public double getSurfaceArea() {
        return 2*(a*b + b*c + a*c);
    }
}
