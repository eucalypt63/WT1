package lab1.task9;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Ball ball1 = new Ball(1, Color.GREEN);
        Ball ball2 = new Ball(2, Color.BLUE);
        Ball ball3 = new Ball(3, Color.GREEN);
        Ball ball4 = new Ball(5, Color.GREEN);
        Ball ball5 = new Ball(3, Color.BLUE);

        Bucket bucket = new Bucket(22);

        bucket.addBall(ball1);
        bucket.addBall(ball2);
        bucket.addBall(ball3);
        bucket.addBall(ball4);
        bucket.addBall(ball5);

        System.out.print("Count of Blue Balls -> ");
        System.out.println(bucket.countBlue());

        System.out.print("Weight of all Balls -> ");
        System.out.println(bucket.countWeight());
    }
}
