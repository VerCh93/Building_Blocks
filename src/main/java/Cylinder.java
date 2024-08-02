public class Cylinder extends Block {
    private double r; //poloměr
    private double h; //výška

    public Cylinder(Colour colour, Type type, double r, double h) {
        super(colour, type);
        this.r = r;
        this.h = h;
    }
    @Override
    public double getVolume() {
        return Math.PI*Math.pow(r, 2)*h;
    }

    @Override
    public double getSurfaceArea() {
        return 2*Math.PI*r*(r+h);
    }
}
