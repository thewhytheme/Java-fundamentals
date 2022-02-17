import java.awt.event.KeyEvent;
import java.util.*;

public class Runner {

    private static void getGreetings (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        ArrayList <String> arrayList = new ArrayList<>();
       if (scanner.hasNext()){
        arrayList.add(scanner.nextLine());}
        System.out.print("Hello, ");
        for (String str: arrayList) {
            System.out.print(str+" ");
        }
    }

    private static void showArgsOfCommandLineInReverseOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter command line arguments: ");
        String[] input = scanner.nextLine().split(" ");
        for (int i = input.length-1; i > -1; i--) {
            System.out.print(input[i] + " ");
        }
        scanner.close();
    }

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

    public static void enterIntNumbersAndCalculateTheirSum(){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        ArrayList <Integer> storage = new ArrayList<>();
        System.out.print("If you want to finish, type not integer number and press 'Enter'"
                +"\nEnter integer numbers to calculate their sum: ");
        while (sc.hasNextInt()){
                storage.add(sc.nextInt());
        }
          for (int j: storage) {sum+=j;}
          System.out.println("Sum of args: "+sum);
    }

    public static void getTheNameOfMonthByNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of month: ");
        int numberOfMonth = scanner.nextInt();
        if (numberOfMonth>0&&numberOfMonth<13){
            switch (numberOfMonth){
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("not a month");
            }
        }else{
            System.out.println("wrong input");
        }

    }
    public static void main(String[] args) {
//getTheNameOfMonthByNumber();
//getGreetings();
//showRandomNumbers();
//showArgsOfCommandLineInReverseOrder();
//enterIntNumbersAndCalculateTheirSum();
    }
}
