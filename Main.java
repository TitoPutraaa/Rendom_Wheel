import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static LinkedList<String> linklst = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    static String value;

    static void input() {
        System.out.print("name : ");
        value = sc.next();
        if (value.equalsIgnoreCase("DONE")) {
            return;
        }
        linklst.add(value);
        input();
    }

    static void spin() {
        int rendom = (int) (Math.random() * linklst.size());
        System.out.print("spin Y/N ? : ");
        String spin = sc.next();
        if (spin.equalsIgnoreCase("N")) {
            return;
        }
        System.out.println("=== " + linklst.get(rendom) + " ===");
        System.out.print("delate " + linklst.get(rendom) + "? Y/N : ");
        String del = sc.next();
        if (del.equalsIgnoreCase("y")) {
            linklst.remove(rendom);
        }
        System.out.println(linklst);
        spin();
    }
    public static void main(String[] args) {    
        do {
            
            System.out.println("\n    MENU");
            System.out.println("1 : NAME INPUT ");
            System.out.println("2 : SPIN");
        System.out.println("3 : HISTORY");
        System.out.println("4 : EXIT");
        System.out.print("PICK : ");
        int pick = sc.nextInt();
        
        switch (pick) {
            case 1:
                System.out.println("type 'DONE' to submit");
                input();
                System.out.println(linklst);
                // linklst.remove(0);
                // System.out.println(linklst);
                
                break;
            case 2:
                spin();
                break;
                case 3:
                
                break;
                case 4:
                System.out.println("THANKYOU ;)");
                return;
                
                default:
                break;
            }
        } while (true);
    }
}
