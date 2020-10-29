package pvlvsoft;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ArrayItemsManagerTest {


    public static ArrayItemsManager<String> A;

    @Before
    public void setup() {

        String[] a = new String[5];
        a[0] = "AB";
        a[1] = "CD";
        a[2] = "EF";
        a[3] = "GH";
        a[4] = "IJ";

        A = new ArrayItemsManager<>(a);
    }


    @Test
    public void add() {


    }

    @Test
    public void testAdd() {
    }

    @Test
    public void addAll() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void removeAll() {
    }

    @Test
    public void testRemove() {
    }

    @Test
    public void size() {
    }

    @Test
    public void clear() {
    }
}