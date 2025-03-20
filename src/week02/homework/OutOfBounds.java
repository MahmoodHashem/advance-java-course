package week02.homework;

public class OutOfBounds {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(numbers[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Warning: Tried to access index " + i + " but array size is " + numbers.length);

            }

        }

    }

}
