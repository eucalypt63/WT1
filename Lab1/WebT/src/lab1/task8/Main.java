package lab1.task8;

public class Main {
    public static void main(String[] args) {
        printIndexes(new double[]{0, 2, 5, 8, 11, 12}, new double[]{1, 2, 6, 7, 10, 13});
    }
    public static void printIndexes(double firstMassive[], double secondMassive[]) {
        for (int i = 0; i < secondMassive.length; i++)
            System.out.println(binarySearching(firstMassive, 0, firstMassive.length - 1, secondMassive[i]));
    }

    static double binarySearching(double[] arr, int leftBorder, int rightBorder, double Element) {
        int m = -1;
        if (Element <= arr[leftBorder])
            return leftBorder;
        if (Element >= arr[rightBorder])
            return rightBorder + 1;

        while (leftBorder <= rightBorder) {
            m = (leftBorder + rightBorder) / 2;
            if (Element >= arr[m] && Element < arr[m + 1])
                return m + 1;

            if (Element < arr[m])
                rightBorder = m - 1;
            if (Element > arr[m])
                leftBorder = m + 1;
        }
        return m;
    }
}
