import java.util.ArrayList;
import java.util.Scanner;

public class Greetings {

    public static void getGreetings (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        ArrayList<String> arrayList = new ArrayList<>();
        if (scanner.hasNext()){
            arrayList.add(scanner.nextLine());}
        System.out.print("Hello, ");
        for (String str: arrayList) {
            System.out.print(str+" ");
        }
    }
}
