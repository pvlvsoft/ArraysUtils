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
    public void constructorTests() {

        String text = "abcd";

        String[] textArea = new String[]{"abcd", "efgh"};
        String[] textArea2 = new String[]{"ijkl", "mnop"};

        ArrayItemsManager<String> test = new ArrayItemsManager<>(text);

        assertNotNull(test.get(0));
        assertTrue(test.get(0) instanceof String);


        test = new ArrayItemsManager<>(textArea, textArea2);
        assertEquals(4, test.size());
    }

    @Test
    public void add() {

        String text = "KL";
        int size = A.size();

        A.add(text);

        assertEquals(text, A.get((A.size()-1)));
        assertEquals(size + 1, A.size());
    }

    @Test
    public void add_with_index() {

        String text = "KL";
        int index = 3;

        A.add(text, index);

        assertEquals(text, A.get(index));
    }

    @Test
    public void addAll() {

        String text1 = "KL";
        String text2 = "MN";

        A.addAll(text1, text2);

        assertEquals(text1, A.get((A.size()-2)));
        assertEquals(text2, A.get((A.size()-1)));
    }


    @Test
    public void remove_instance() {

        String text = "AB";
        int i = A.size();

        A.remove(text);

        assertEquals(A.size(), i-1);
    }

    @Test
    public void remove_non_existing() {


        String text = "NOT_INSIDE_THE_ARRAY";
        int i = A.size();

        A.remove(text);

        assertEquals(A.size(), i);
    }

    @Test
    public void removeAll_all_inside() {

        String text1 = "AB";
        String text2 = "CD";
        int i = A.size();

        A.removeAll(text1, text2);

        assertEquals(A.size(), i-2);
    }

    @Test
    public void remove_by_index() {

        int index = 0;
        int i = A.size();
        String text = A.get(1);

        A.remove(index);

        assertEquals(i-1, A.size());
        assertEquals(text, A.get(0));
    }

    @Test
    public void clear() {

        A.clear();

        assertEquals(0, A.size());

        String text = "AB";

        A.add(text);

        assertEquals(1, A.size());
        assertEquals(text, A.get(0));
    }


    @Test
    public void trim() {

        int size = A.size();


        A.add(null);
        A.add(null);
        A.add(null);
        A.add(null);
        A.add(null);
        A.add(null);

        A.trim();

        assertEquals(size, A.size());
    }

    @Test
    public void isTrimmed() {

        A.add(null);

        assertFalse(A.isTrimmed());
    }

    @Test
    public void contains() {

        String text = A.get(0);

        assertTrue(A.contains(text));
    }
}