import java.util.Arrays;

public class Task_3_DZ {
    public static void main(String[] args) {
        int[] firstArray = {1,1};
        int[] secondArray = {1,3};
        System.out.println(Arrays.toString(createArrayBySubtraction(firstArray, secondArray)));
    }

    public static int[] createArrayBySubtraction(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            throw new RuntimeException("Array lengths are not equal");
        }
        else {
            int[] newArray = new int[firstArray.length];
            for (int i = 0; i < newArray.length; i++) {
               newArray[i] = firstArray[i] - secondArray[i]; 
            }
            return newArray;
        }
    }
}
