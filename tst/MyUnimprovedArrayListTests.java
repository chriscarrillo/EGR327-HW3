import org.junit.Assert;
import org.junit.Test;

public class MyUnimprovedArrayListTests {
    MyUnimprovedArrayList<Integer> arrayList = new MyUnimprovedArrayList<>();

    private void buildArrayList() {
        arrayList.add(7);
        arrayList.add(13);
        arrayList.add(124);
        arrayList.add(2329);
        arrayList.add(22);
        arrayList.add(267);
        arrayList.add(732);
        arrayList.add(754);
        arrayList.add(35);
        arrayList.add(542);
    }

    @Test
    public void constructorTest() {
        buildArrayList();
        Assert.assertEquals(MyUnimprovedArrayList.class, arrayList.getClass());
        Assert.assertEquals(10, arrayList.size());
    }

    @Test
    public void getTest() throws MyArrayIndexOutOfBounds {
        buildArrayList();
        Assert.assertEquals((Integer) 7, arrayList.get(0));
    }

    @Test(expected = MyArrayIndexOutOfBounds.class)
    public void getIndexOutOfBoundsTest() throws MyArrayIndexOutOfBounds {
        buildArrayList();
        arrayList.get(425);
    }

    @Test(expected = MyArrayIndexOutOfBounds.class)
    public void getLessThanZeroTest() throws MyArrayIndexOutOfBounds {
        buildArrayList();
        arrayList.get(-4);
    }

    @Test
    public void addTest() {
        buildArrayList();
        arrayList.add(7);
        Assert.assertEquals(11, arrayList.size());
    }

    @Test
    public void removeTest() throws MyArrayIndexOutOfBounds {
        buildArrayList();
        arrayList.remove(0);
        Assert.assertEquals(9, arrayList.size());
    }

    @Test(expected = MyArrayIndexOutOfBounds.class)
    public void removeIndexOutOfBoundsTest() throws MyArrayIndexOutOfBounds {
        buildArrayList();
        arrayList.remove(425);
    }

    @Test(expected = MyArrayIndexOutOfBounds.class)
    public void removeLessThanZeroTest() throws MyArrayIndexOutOfBounds {
        buildArrayList();
        arrayList.remove(-4);
    }

    @Test
    public void sizeTest() throws MyArrayIndexOutOfBounds {
        buildArrayList();
        arrayList.add(12);
        Assert.assertEquals(11, arrayList.size());

        arrayList.remove(1);
        Assert.assertEquals(10, arrayList.size());
    }
}
