import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] arr_value;
    
    public static void main(String[] args) {
        System.out.println("\nWELCOME TO RENDOM WHEEL");
        do {
            System.out.println("\n===MENU===");
            System.out.println("1 : INPUT ");
            System.out.println("2 : SPIN ");
            System.out.println("3 : HISTORY ");
            System.out.println("4 : EXIT ");
            System.out.print("PICK : ");
            int pick = sc.nextInt();
            
            switch (pick) {
                case 1:
                arr_value = input();
                    break;
                case 2:
                    System.out.println(Arrays.toString(arr_value));
                        break;
                case 3:
                    
                        break;
                case 4:
                    System.out.println("THANKYOU ;)");
                    return;
            
                default:
                    System.out.println("menu not found! || please input the right menu!");
                    break;
            }
        } while (true);
    }

    // input value method 
    static String[] input() {
        System.out.print("input how much name : ");
        int total_value = sc.nextInt();
        String[] value = new String[total_value];
        for (int i = 0; i < value.length; i++) {
            System.out.print("input " + (i+1) + " : ");
            value[i] = sc.next();
        }
        System.out.println(Arrays.toString(value));
        return value;
    }
}