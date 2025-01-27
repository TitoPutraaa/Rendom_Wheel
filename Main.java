import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\nWELCOME TO RENDOM WHEEL");
        do {
            System.out.println("\n===MENU===");
            System.out.println("1 : INPUT ");
            System.out.println("2 : SPIN ");
            System.out.println("3 : HISTORY ");
            System.out.println("4 : EXIT ");
            System.out.println("PICK : ");
            int pick = sc.nextInt();

            switch (pick) {
                case 1:
                    
                    break;
                case 2:
                    
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
}