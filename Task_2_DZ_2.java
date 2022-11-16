public class Task_2_DZ_2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] arr = new int[9];
            int catchedRes1 = arr[8] / d; //как поняла, имеется в виду какой-то элемент массива поделить на d
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         // если хотим использовать double - деление на 0 допускается, не дает нам ArithmeticException
         
    }
}
