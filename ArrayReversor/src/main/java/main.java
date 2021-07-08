import java.util.Arrays;
import java.util.Collections;

public class main {

     int[] flattenArray(int[][] twoDArr){

        if (twoDArr == null)
            return null;

        return Arrays.stream(twoDArr).flatMapToInt(Arrays::stream).toArray();


    }

     static int[] reverseArray(int[][] arr){

         main flattenClass = new main();
        int[] flattened = flattenClass.flattenArray(arr);
        int size = flattened.length;

        int[] revrsed = new int[size];

        for (int i = size - 1 ; i > -1; i--){

            revrsed[size - 1 - i] = flattened[i];
        }

        return revrsed;
    }

    public static void main(String[] args) {

    }
}
