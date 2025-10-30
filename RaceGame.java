import java.util.Random;

public class RaceGame {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        int finishLine = 50;
        int p1 = 0, p2 = 0;
        boolean finished = false;

        System.out.println("🏁 Welcome to the Race Game! 🏁");
        System.out.println("Two racers are competing... let's begin!\n");

        // Loop till someone finishes
        while (!finished) {
            // Clear screen effect (prints new lines)
            System.out.print("\033[H\033[2J");  
            System.out.flush();

            // Update racers randomly (1–3 steps)
            p1 += rand.nextInt(3) + 1;
            p2 += rand.nextInt(3) + 1;

            // Draw track
            printTrack("Player 1", p1, finishLine);
            printTrack("Player 2", p2, finishLine);

            // Check if finished
            if (p1 >= finishLine || p2 >= finishLine) {
                finished = true;
                System.out.println("\n🏁🏁 RACE FINISHED! 🏁🏁");
                if (p1 >= finishLine && p2 >= finishLine)
                    System.out.println("It's a tie!");
                else if (p1 >= finishLine)
                    System.out.println("Player 1 wins! 🏆");
                else
                    System.out.println("Player 2 wins! 🏆");
            }

            Thread.sleep(300); // delay for animation
        }
    }

    static void printTrack(String name, int position, int finishLine) {
        if (position > finishLine) position = finishLine;
        for (int i = 0; i < finishLine; i++) {
            if (i == position)
                System.out.print("🏃"); // racer
            else
                System.out.print("-");
        }
        System.out.println(" | " + name);
    }
}
import java.util.Random;

public class RaceGame {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        int finishLine = 50;
        int p1 = 0, p2 = 0;
        boolean finished = false;

        System.out.println("🏁 Welcome to the Race Game! 🏁");
        System.out.println("Two racers are competing... let's begin!\n");

        while (!finished) {
            // Clear console for animation
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Update positions randomly (1 to 3 steps)
            p1 += rand.nextInt(3) + 1;
            p2 += rand.nextInt(3) + 1;

            // Draw race tracks
            printTrack("Player 1", p1, finishLine);
            printTrack("Player 2", p2, finishLine);

            // Check race status
            if (p1 >= finishLine || p2 >= finishLine) {
                finished = true;
                System.out.println("\n🏁🏁 RACE FINISHED! 🏁🏁");
                if (p1 >= finishLine && p2 >= finishLine)
                    System.out.println("It's a tie!");
                else if (p1 >= finishLine)
                    System.out.println("Player 1 wins! 🏆");
                else
                    System.out.println("Player 2 wins! 🏆");
            }

            // Delay for animation
            Thread.sleep(300);
        }
    }

    static void printTrack(String name, int pos, int finishLine) {
        if (pos > finishLine) pos = finishLine;
        for (int i = 0; i < finishLine; i++) {
            if (i == pos)
                System.out.print("🏃"); // Racer emoji
            else
                System.out.print("-");
        }
        System.out.println(" | " + name);
    }
}
