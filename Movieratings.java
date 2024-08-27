import java.util.Scanner;

public class Movieratings {

    public static void main(String[] args) {
        Scanner tangent = new Scanner(System.in);
        int rating = tangent.nextInt();
        if (rating > 5000) {
          System.out.println("good");
        } if  (rating > 25000) {
          System.out.println("better");
        } if (45000 < rating && rating > 70000) {
          System.out.println("best");
        } if (rating > 75000) {
          System.out.println("out of the world");
        }
        }
      }
    

