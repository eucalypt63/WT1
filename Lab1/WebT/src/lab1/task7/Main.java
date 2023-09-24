package lab1.task7;
import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        double[] mas ={4,3,2,1,52,21,14,16,24,51,20,12,32,52,1,4,23,8};
        ShellSort(mas);
        System.out.println(Arrays.toString(mas));
    }
    public static void ShellSort(double[] A) {
        int n = A.length;
        int gap = n / 2;

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                double temp = A[i];
                int j = i;
                while (j >= gap && A[j - gap] > temp) {
                    A[j] = A[j - gap];
                    j -= gap;
                }
                A[j] = temp;
            }
            gap /= 2;
        }
    }
}
