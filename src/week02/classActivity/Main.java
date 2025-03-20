package week02.classActivity;

import java.util.InputMismatchException;


public class Main {

    public static void main(String[] args)  {

      

        try {
            int n = 5;
            int d = 0;

            int result = n / d;

            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("End of File");

    }

}
