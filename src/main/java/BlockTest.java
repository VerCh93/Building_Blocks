import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class BlockTest {

    public static class TestKostka {
        @Test
        public void getVolume() {
            Block kostka = new Cube(Block.Colour.RED, Block.Type.CHILD, 3);
            assertEquals(27.0, kostka.getVolume(), 0);
        }
        @Test
        public void getSurfaceArea() {
            Block kostka = new Cube(Block.Colour.RED, Block.Type.CHILD, 3);
            assertEquals(54.0, kostka.getSurfaceArea(), 0);
        }
    }
    public static class TestHranol {
        @Test
        public void getVolume() {
            Block hranol = new Prism(Block.Colour.YELLOW, Block.Type.CHILD, 3, 7);
            assertEquals(63.0, hranol.getVolume(), 0);
        }
    }
    public static class TestPreklad {
        @Test
        public void getSurfaceArea() {
            Block preklad = new Lintel(Block.Colour.BLUE, Block.Type.BABY, 6, 12, 3);
            assertEquals(252.0, preklad.getSurfaceArea(), 0);
        }
    }
    public static class TestValec {
        @Test
        public void getVolume() {
            Block valec = new Cylinder(Block.Colour.GREEN, Block.Type.BABY, 6, 10);
            assertEquals(1130.0, valec.getVolume(), 1);
        }
    }
}

