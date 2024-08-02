public abstract class Block {
    protected enum Colour {
        RED, YELLOW, BLUE, GREEN, WHITE
    }
    protected enum Type {
        BABY, CHILD
    }
    protected Colour colour;
    protected Type type;

    public Block(Colour colour, Type type) {
        this.colour = colour;
        this.type = type;
    }

    public abstract double getVolume();
    public abstract double getSurfaceArea();

    @Override
    public String toString() {
        return "Block{" +
                "colour=" + colour +
                ", type=" + type +
                '}';
    }
}
