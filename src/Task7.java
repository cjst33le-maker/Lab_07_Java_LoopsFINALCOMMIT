public class Task7 {
    static void main() {
        for (int row = 0; row < 5; row++){
            for (int column = 0; column < 5 - row; column++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
