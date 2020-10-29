package pvlvsoft;


/**
 * <i>AUTHOR OF THIS PROJECT IS NOT RESPONSIBLE FOR ANY DAMAGE TO
 * THE USER'S DEVICE CAUSED BY USING THIS SOFTWARE, NO DATA LEAKS
 * OR DATA INTEGRITY DAMAGE.</i>
 *
 * <i>THIS PIECE OF SOFTWARE WAS MADE WITH NO GUARANTEE AND SHOULD
 * NOT BE USED FOR CRITICAL INFRASTRUCTURE OF YOUR APPS. THIS
 * PROJECT WAS CREATED JUST FOR FUN.</i>
 *
 *
 * <p>Class of {@link ArrayItemsObjectifier} is an abstract representation
 * and implementation of the instances belonging to this class.</p>
 *
 * <p>This class allows to transpose given arrays of primitives to the
 * version of object arrays. In other words, {@code int[]} is transfered to
 * {@link Integer}{@code []}, {@code char[]} into {@link Character}{@code []}
 * and so on.</p>
 *
 * <p>This class' instances creation is forbidden by model - there is no
 * reason to instantiate this process. Therefore the non-parametric
 * constructor is set private and others are not defined.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-10-29
 */
public class ArrayItemsObjectifier {


    /* =========================================================== */
    /* ====== CONSTRUCTORS ======================================= */


    /**
     * <p>Private constructor preventing the instance creation.</p>
     */
    private ArrayItemsObjectifier() {}


    /* =========================================================== */
    /* ====== STATIC METHODS ===================================== */


    /**
     * <p>Static method responsible of primitive type values containing
     * array to objects containing array transposition.</p>
     *
     * @param array     to be transposed
     *
     * @return          transposed array of the type
     */
    public static Integer[] objectify(int[] array) {

        Integer[] arr = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {

            arr[i] = Integer.valueOf(array[i]);
        }

        return arr;
    }


    /**
     * <p>Static method responsible of primitive type values containing
     * array to objects containing array transposition.</p>
     *
     * @param array     to be transposed
     *
     * @return          transposed array of the type
     */
    public static Character[] objectify(char[] array) {

        Character[] arr = new Character[array.length];

        for (int i = 0; i < array.length; i++) {

            arr[i] = Character.valueOf(array[i]);
        }

        return arr;
    }


    /**
     * <p>Static method responsible of primitive type values containing
     * array to objects containing array transposition.</p>
     *
     * @param array     to be transposed
     *
     * @return          transposed array of the type
     */
    public static Long[] objectify(long[] array) {

        Long[] arr = new Long[array.length];

        for (int i = 0; i < array.length; i++) {

            arr[i] = Long.valueOf(array[i]);
        }

        return arr;
    }


    /**
     * <p>Static method responsible of primitive type values containing
     * array to objects containing array transposition.</p>
     *
     * @param array     to be transposed
     *
     * @return          transposed array of the type
     */
    public static Short[] objectify(short[] array) {

        Short[] arr = new Short[array.length];

        for (int i = 0; i < array.length; i++) {

            arr[i] = Short.valueOf(array[i]);
        }

        return arr;
    }


    /**
     * <p>Static method responsible of primitive type values containing
     * array to objects containing array transposition.</p>
     *
     * @param array     to be transposed
     *
     * @return          transposed array of the type
     */
    public static Byte[] objectify(byte[] array) {

        Byte[] arr = new Byte[array.length];

        for (int i = 0; i < array.length; i++) {

            arr[i] = Byte.valueOf(array[i]);
        }

        return arr;
    }


    /**
     * <p>Static method responsible of primitive type values containing
     * array to objects containing array transposition.</p>
     *
     * @param array     to be transposed
     *
     * @return          transposed array of the type
     */
    public static Boolean[] objectify(boolean[] array) {

        Boolean[] arr = new Boolean[array.length];

        for (int i = 0; i < array.length; i++) {

            arr[i] = Boolean.valueOf(array[i]);
        }

        return arr;
    }
}
