package pvlvsoft;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class ArrayConcatorTest {

    @Test
    public void concat_Object_String() {

        String[] a = new String[3];
        a[0] = "abc";
        a[1] = "def";
        a[2] = "ghi";

        String[] b = new String[3];
        b[0] = "jkl";
        b[1] = "mno";
        b[2] = "pqr";

        ArrayConcator<String> arrayConcator = new ArrayConcator<>(a, b);
        assertEquals(Arrays.toString(arrayConcator.concat()), Arrays.toString(new String[]{"abc", "def", "ghi", "jkl", "mno", "pqr"}));
    }

    @Test
    public void concat_Object_Character() {

        Character[] a = new Character[3];
        a[0] = 'a';
        a[1] = 'b';
        a[2] = 'c';

        Character[] b = new Character[3];
        b[0] = 'd';
        b[1] = 'e';
        b[2] = 'f';

        ArrayConcator<Character> arrayConcator = new ArrayConcator<>(a, b);
        assertEquals(Arrays.toString(arrayConcator.concat()), Arrays.toString(new Character[]{'a', 'b', 'c', 'd', 'e', 'f'}));
    }


    @Test
    public void concat_primitives() {

        char[] a = new char[3];
        a[0] = 'a';
        a[1] = 'b';
        a[2] = 'c';

        char[] b = new char[3];
        b[0] = 'd';
        b[1] = 'e';
        b[2] = 'f';

        ArrayConcator<Character> arrayConcator = new ArrayConcator<>(a, b);
        assertEquals(Arrays.toString(arrayConcator.concat()), Arrays.toString(new Character[]{'a', 'b', 'c', 'd', 'e', 'f'}));
    }
}