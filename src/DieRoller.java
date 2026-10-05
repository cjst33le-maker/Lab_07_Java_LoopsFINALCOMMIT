import java.util.Random;
public class DieRoller {
    static void main()
    {

        Random rnd = new Random();

        int die1, die2, die3;
        int roll = 1;
        int sum;
        do {
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
            sum = die1 + die2 + die3;
            System.out.printf("%d %d %d %d %d%n", roll, die1, die2, die3, sum);
            roll++;
        }
        while (die1 != die2 || die2 != die3);











    }
}
