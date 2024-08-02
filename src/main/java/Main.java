public class Main {
    public static void main(String[] args) {
        Block kostka = new Cube(Block.Colour.RED, Block.Type.CHILD, 3);
        Block preklad = new Lintel(Block.Colour.BLUE, Block.Type.BABY, 6, 12, 3);
        Block hranol = new Prism(Block.Colour.YELLOW, Block.Type.CHILD, 3, 7);
        Block valec = new Cylinder(Block.Colour.GREEN, Block.Type.BABY, 6, 10);

        System.out.println("Objem kostky: " + kostka.getVolume() + " cm3" + ", typ a barva: " + kostka);
        System.out.println("Povrch kostky: " + kostka.getSurfaceArea() + " cm2" + ", typ a barva: " + kostka);
        System.out.println("Objem válce: " + valec.getVolume() + " cm3" + ", typ a barva: " + valec);
        System.out.println("Povrch překladu: " + preklad.getSurfaceArea() + " cm2" + ", typ a barva: " + preklad);
        System.out.println("Objem hranolu: " + hranol.getVolume() + " cm3" + ", typ a barva: " + hranol);
    }
}