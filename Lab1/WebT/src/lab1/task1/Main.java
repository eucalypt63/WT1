package lab1.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution(5, 12));
    }

    public static double Solution(double X, double Y){
        double numb = (1 + Math.sin(X+Y) * Math.sin(X+Y)) / (2 + Math.abs(X - 2*X/(1 + X*X * Y*Y))) + X;
        return numb;
    }
}
