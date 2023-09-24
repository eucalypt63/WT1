package lab1.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println(check(-5,-2));
    }

    public static boolean check(int X, int Y){
        return checkBottom(X, Y) || checkTop(X, Y);
    }

    public static boolean checkBottom(int X, int Y){
        return (X >= -6 && X <= 6) && (Y >= -3 && Y <= 0);
    }

    public static boolean checkTop(int X, int Y){
        return (X >= -4 && X <= 4) && (Y >= 0 && Y <= 5);
    }
}
