import java.util.Scanner;

public class evenodd {
    public static void main(String[]args) {
        Scanner x = new Scanner(System.in);
        System.out.print(" Rashi: Please enetr a number: ");
        int num = x.nextInt();
        if (num % 2 == 0) {
            System.out.println(" Sunil: the number " + num + " is even. " );
        }
        else { 
            System.out.println(" Sunil: the number " + num + " is odd. ");
        }
           
    }
    
}
