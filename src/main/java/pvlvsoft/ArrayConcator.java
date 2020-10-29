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
 * <p>Class of {@link ArrayConcator} is an abstract representation
 * and implementation of the instances belonging to this class.</p>
 *
 * <p>Instances of this class makes a set of arrays (array of arrays)
 * into one big array containing all instances contained in those arrays.</p>
 *
 * <p>It also provides transposition of primitive types using
 * {@link ArrayItemsObjectifier} class, so arrays of ints and booleans can
 * be concatenated too.</p>
 *
 * <p><b>ALWAYS BE CAREFUL ABOUT TYPE DEFINITION WHILE USING PRIMITIVES!</b>
 * There may be a problem while trying to transpose to incompatible type.</p>
 *
 * @author Vojtech Pavlu
 * @version 2020-10-29
 *
 * @see ArrayItemsObjectifier
 */
public class ArrayConcator<T> {

    /* =========================================================== */
    /* ====== INSTANCE VARIABLES ================================= */

    private final T[][] arrays;

    /* =========================================================== */
    /* ====== CONSTRUCTORS ======================================= */


    /**
     * <p>Private constructor preventing unauthorized instance creation.</p>
     */
    private ArrayConcator() {

        this.arrays = null;
    }


    /**
     * <p>Basic constructor passing the given set of arrays to the local variable.</p>
     *
     * @param arrays    to be concatenated
     */
    public ArrayConcator(T[]... arrays) {

        this.arrays = arrays;
    }


    /**
     * <p>Constructor of primitive type concator.</p>
     *
     * <p>Primitive type of {@code int[]} will be transposed to the object of {@link Integer}
     * and than the set of arrays may get the opportunity to be concatenated.</p>
     *
     * @param arrays    to be concatenated. Primitives are allowed.
     */
    public ArrayConcator(int[]... arrays) {

        Integer[][] arr = new Integer[arrays.length][];

        for (int i = 0; i < arrays.length; i++) {

            arr[i] = ArrayItemsObjectifier.objectify(arrays[i]);
        }

        this.arrays = (T[][]) arr;
    }


    /**
     * <p>Constructor of primitive type concator.</p>
     *
     * <p>Primitive type of {@code char[]} will be transposed to the object of {@link Character}
     * and than the set of arrays may get the opportunity to be concatenated.</p>
     *
     * @param arrays    to be concatenated. Primitives are allowed.
     */
    public ArrayConcator(char[]... arrays) {

        Character[][] arr = new Character[arrays.length][];

        for (int i = 0; i < arrays.length; i++) {

            arr[i] = ArrayItemsObjectifier.objectify(arrays[i]);
        }

        this.arrays = (T[][]) arr;
    }


    /**
     * <p>Constructor of primitive type concator.</p>
     *
     * <p>Primitive type of {@code long[]} will be transposed to the object of {@link Long}
     * and than the set of arrays may get the opportunity to be concatenated.</p>
     *
     * @param arrays    to be concatenated. Primitives are allowed.
     */
    public ArrayConcator(long[]... arrays) {

        Long[][] arr = new Long[arrays.length][];

        for (int i = 0; i < arrays.length; i++) {

            arr[i] = ArrayItemsObjectifier.objectify(arrays[i]);
        }

        this.arrays = (T[][]) arr;
    }

    /**
     * <p>Constructor of primitive type concator.</p>
     *
     * <p>Primitive type of {@code byte[]} will be transposed to the object of {@link Byte}
     * and than the set of arrays may get the opportunity to be concatenated.</p>
     *
     * @param arrays    to be concatenated. Primitives are allowed.
     */
    public ArrayConcator(byte[]... arrays) {

        Byte[][] arr = new Byte[arrays.length][];

        for (int i = 0; i < arrays.length; i++) {

            arr[i] = ArrayItemsObjectifier.objectify(arrays[i]);
        }

        this.arrays = (T[][]) arr;
    }


    /**
     * <p>Constructor of primitive type concator.</p>
     *
     * <p>Primitive type of {@code boolean[]} will be transposed to the object of {@link Boolean}
     * and than the set of arrays may get the opportunity to be concatenated.</p>
     *
     * @param arrays    to be concatenated. Primitives are allowed.
     */
    public ArrayConcator(boolean[]... arrays) {

        Boolean[][] arr = new Boolean[arrays.length][];

        for (int i = 0; i < arrays.length; i++) {

            arr[i] = ArrayItemsObjectifier.objectify(arrays[i]);
        }

        this.arrays = (T[][]) arr;
    }

    /**
     * <p>Constructor of primitive type concator.</p>
     *
     * <p>Primitive type of {@code short[]} will be transposed to the object of {@link Short}
     * and than the set of arrays may get the opportunity to be concatenated.</p>
     *
     * @param arrays    to be concatenated. Primitives are allowed.
     */
    public ArrayConcator(short[]... arrays) {

        Short[][] arr = new Short[arrays.length][];

        for (int i = 0; i < arrays.length; i++) {

            arr[i] = ArrayItemsObjectifier.objectify(arrays[i]);
        }

        this.arrays = (T[][]) arr;
    }

    /* =========================================================== */
    /* ====== OVERRIDDEN METHODS ================================= */




    /* =========================================================== */
    /* ====== INSTANCE METHODS =================================== */


    /**
     * <p>Method providing the main functionality of the instance.</p>
     *
     * <p>This instance provides the whole concatenation of the set of arrays.</p>
     *
     * @return  concatenated arrays to one.
     */
    public T[] concat() {

        int numOfItems = 0;
        int poniter = 0;

        for (T[] o : this.arrays) {

            numOfItems = numOfItems + o.length;
        }

        T[] array = (T[]) new Object[numOfItems];

        for (T[] tArr : this.arrays) {

            for (T t : tArr) {

                array[poniter] = t;
                poniter++;
            }
        }

        return array;
    }


    /* =========================================================== */
    /* ====== GETTERS AND SETTERS ================================ */

    public T[][] getArrays() {

        return arrays;
    }
}
