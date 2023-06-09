import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = {1.0, 2.4, 5.3, -2.6, 4.1, 6.1, 7.6, -1.4, 2.8, 7.2, -5.1, 7.3, 6.2, 4.6, 1.2};
        System.out.println("Весь массив: " + Arrays.toString(array));
        boolean checkNumber = false;
        double sum = 0;
        double amount = 0;

        for (double numb : array) {
            if (numb < 0) {
                checkNumber = true;
            } else if (checkNumber) {
                sum += numb;
                amount++;
            }
        }
        System.out.println("Среднее арифметическое " + sum / amount);
    }

}