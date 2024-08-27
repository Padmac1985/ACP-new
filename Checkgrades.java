import java.util.Scanner;

public class Checkgrades {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int score = str.nextInt();
        if (score > 90) {
            System.out.println("Grade A");
        } else if (score > 80) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade F");
        }

    }

}
