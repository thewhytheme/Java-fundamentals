import java.util.ArrayList;
import java.util.Scanner;

public class SumOfArgs {

    public static void enterIntNumbersAndCalculateTheirSum(){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        ArrayList<Integer> storage = new ArrayList<>();
        System.out.print("If you want to finish, type not integer number and press 'Enter'"
                +"\nEnter integer numbers to calculate their sum: ");
        while (sc.hasNextInt()){
            storage.add(sc.nextInt());
        }
        for (int j: storage) {sum+=j;}
        System.out.println("Sum of args: "+sum);
    }
}
