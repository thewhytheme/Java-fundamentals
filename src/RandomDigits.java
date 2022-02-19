import java.util.Random;
import java.util.Scanner;

public class RandomDigits {

    public static void showRandomNumbers (){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter how many random numbers would you like to print: ");
        if (scan.hasNextInt()){
            int howMany = scan.nextInt();
            int [] mass = new int[howMany];
            System.out.print(howMany+" random number(s): ");
            for (int i = 0; i < mass.length; i++) {
                mass[i]= random.nextInt();
            }
            System.out.print("in row: ");
            for (int j : mass) {
                System.out.print(j + " ");
            }
            System.out.println("\nin column: ");
            for (int j : mass) {
                System.out.println(j);
            }
        }else{
            System.out.println("wrong input");
        }
    }
}
