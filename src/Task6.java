public class Task6 {
    static void main() {
        for (int row = 0; row < 5; row++){
            for (int column = 0; column < row + 1; column++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
