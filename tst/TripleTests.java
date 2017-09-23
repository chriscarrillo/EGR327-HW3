import org.junit.Assert;
import org.junit.Test;

public class TripleTests {
    private Triple<Integer, String, Double> triple = new Triple<>(1, "Middle", 2.0);

    @Test
    public void constructorTest() {
        Assert.assertEquals(Triple.class, triple.getClass());
        Assert.assertFalse(triple.getMiddle() == "Right");
    }

    @Test
    public void getLeftTest() {
        Assert.assertEquals((Integer) 1, triple.getLeft());
    }

    @Test
    public void setLeftTest() {
        triple.setLeft(21);
        Assert.assertEquals((Integer) 21, triple.getLeft());
    }

    @Test
    public void getMiddleTest() {
        Assert.assertEquals("Middle", triple.getMiddle());
    }

    @Test
    public void setMiddleTest() {
        triple.setMiddle("I am changed");
        Assert.assertEquals("I am changed", triple.getMiddle());
    }

    @Test
    public void getRightTest() {
        Assert.assertEquals((Double) 2.0, triple.getRight());
    }

    @Test
    public void setRightTest() {
        triple.setRight(35.0);
        Assert.assertEquals((Double) 35.0, triple.getRight());
    }

    @Test
    public void toStringTest() {
        Assert.assertEquals("(1, Middle, 2.0)", triple.toString());
    }
}
