import java.util.Arrays;

public class main {

    static int[] flattenArray(int[][] twoDArr){

        if (twoDArr == null)
            return null;

      return Arrays.stream(twoDArr).flatMapToInt(Arrays::stream).toArray();


    }

    public static void main(String[] args) {

    }

    public static class flattenClass {

        public int[] flattenArray(int[][] twoDArr){

            if (twoDArr == null)
                return null;

            return Arrays.stream(twoDArr).flatMapToInt(Arrays::stream).toArray();


        }
    }
}
