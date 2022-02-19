import java.util.Scanner;

public class ReverseArgs {

    public static void showArgsOfCommandLineInReverseOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter command line arguments: ");
        String[] input = scanner.nextLine().split(" ");
        for (int i = input.length-1; i > -1; i--) {
            System.out.print(input[i] + " ");
        }
        scanner.close();
    }
}
