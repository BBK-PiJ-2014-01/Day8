/**
 * Created by Pierre on 28/12/2014.
 */
public class HashUtilities {

    public static int shortHash(int number) {
        int output = Math.abs(number) % 1000;
        // Making sure that the key is strictly greater than 0
        if(output == 0)
            return(1);
        else
            return(output);
    }

}
