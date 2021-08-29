package Helpers;

public class Helpers {
    public static int[] generateArray(int length) {
        var output = new int[length];

        for (int i = 0; i < length; i++) {
            output[i] = 1;
        }

        return output;
    }
}
