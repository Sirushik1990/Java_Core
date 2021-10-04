package chapter3;

public class Scope {
    public static void main(String[] args) {
        int x, y;
        x = 12;
        y = 7;
        if (x == 12) {
            y = 20;
            x = y * 2;
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
