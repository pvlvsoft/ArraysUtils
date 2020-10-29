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
 * <p>Class of {@link ArrayItemsManager} is an abstract representation
 * and implementation of the instances belonging to this class.</p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-10-29
 */
public class ArrayItemsManager<T> {

    /* =========================================================== */
    /* ====== INSTANCE VARIABLES ================================= */

    private T[] array;


    /* =========================================================== */
    /* ====== STATIC VARIABLES =================================== */




    /* =========================================================== */
    /* ====== INSTANCE INIT BLOCKS =============================== */




    /* =========================================================== */
    /* ====== STATIC INIT BLOCKS ================================= */





    /* =========================================================== */
    /* ====== CONSTRUCTORS ======================================= */


    private ArrayItemsManager() {}


    public ArrayItemsManager(T[] array) {

        this.array = array;
    }


    public ArrayItemsManager(T[]... arrays) {

        this.array = new ArrayConcator<T>(arrays).concat();
    }



    /* =========================================================== */
    /* ====== OVERRIDDEN METHODS ================================= */




    /* =========================================================== */
    /* ====== INSTANCE METHODS =================================== */


    public void add(T item) throws IllegalArgumentException {

        this.add(item, array.length);
    }


    public void add(T item, int index) throws IllegalArgumentException {

        if(index >= this.array.length) {

            throw new IllegalArgumentException(
                    String.format(
                            "The index the instance should have has to be smaller than the array length (%s)!",
                            this.array.length)
            );
        }

        if(index < 0) {

            throw new IllegalArgumentException(
                    String.format(
                            "The index has to be greater or equal to 0 (%s)!",
                            index)
            );
        }

        Object[] arr = new Object[array.length + 1];

        for (int i = 0; i < arr.length; i++) {

            if(i < index) {

                arr[i] = this.array[i];
            }
            else if(i > index) {

                arr[i+1] = this.array[i];
            }
            else {

                arr[i] = item;
            }
        }

        this.array = (T[]) arr;
    }


    public void addAll(T... items) {

        this.array = new ArrayConcator<T>(this.array, items).concat();
    }


    public void remove(T item) {

        for (int i = 0; i < this.size(); i++) {

            if(this.array[i].equals(item)) {

                this.remove(i);
                i--;
            }
        }
    }

    public void removeAll(T... items) {

        for (T item : items) {

            this.remove(item);
        }
    }

    public void remove(int index) {

        if(index < 0 || index > (array.length-1)) {

            throw new IllegalArgumentException(
                    String.format(
                            "Given index is not in the range of the array indexes (0 - %s) - %s",
                            array.length-1,
                            index)
            );
        }

        T[] arr = (T[]) new Object[array.length-1];

        for (int i = 0; i < arr.length; i++) {

            if(i < index) {

                arr[i] = this.array[i];

            } else if(i > index) {

                arr[i] = this.array[i+1];
            }
        }

        this.array = arr;
    }

    public int size() {

        return this.array.length;
    }


    public void clear() {

        this.array = (T[]) new Object[0];
    }


    public T get(int index) {

        return this.array[index];
    }


    /* =========================================================== */
    /* ====== STATIC METHODS ===================================== */




    /* =========================================================== */
    /* ====== GETTERS AND SETTERS ================================ */




    /* =========================================================== */
    /* ====== MAIN METHOD ======================================== */

    /*
    public static void main(String[] args) {
        
        System.out.println(">>> QUICK TEST OF ArrayItemRemover BEGINS!");
        
        
        System.out.println(">>> QUICK TEST OF ArrayItemRemover ENDED SUCCESSFULLY!");
    }
    */

}
