package lab1.task4;

public class Main {
    public static void main(String[] args) {
        int[] sourceArray = new int[]{1, 2, 3, 4, 7, 9, 11};
        printIndexOfPrimeNumbers(sourceArray);
    }

    public static void printIndexOfPrimeNumbers(int[] mas) {
        boolean hasPrimeNumbers = false;
        for (int i = 0; i < mas.length; i++) {
            if (isPrime(mas[i])) {
                hasPrimeNumbers = true;
                System.out.format("%d -> %d\n", i, mas[i]);
            }
        }

        if (!hasPrimeNumbers)
            System.out.println("No prime numbers");
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false; // Числа меньше 2 не являются простыми
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Число делится нацело, поэтому не является простым
            }
        }
        return true;
    }
}
