package chapter3;

public class LifeTime {
    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i++) {
            int y = 0;
            System.out.println(y);
            y = 100;
            System.out.println(y);

        }
        int y = 800;
        System.out.println(y);
    }
}
