import java.util.Arrays;

public class flattenClass {
    static int[] flattenArray(int[][] twoDArr){

        if (twoDArr == null)
            return null;

        return Arrays.stream(twoDArr).flatMapToInt(Arrays::stream).toArray();


    }

    public static void main(String[] args) {

    }
}
