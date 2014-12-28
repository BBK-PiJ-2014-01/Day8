/**
 * Created by Pierre on 28/12/2014.
 */
public class HashUtilities {

    public static int shortHash(int number) {
        int output = Math.abs(number) % 1000;
        return(output);
    }

}
