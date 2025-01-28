import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] arr_value;

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

    static void spin() {
        int rendom ;
        System.out.println("---------------------");
        System.out.println("        " + arr_value[rendom]);
        System.out.println("---------------------");
        System.out.println("\n1 : remove");
        System.out.println("2 : close");
        System.out.print("pick : ");
        int pick = sc.nextInt();
        
        switch (pick) {
            case 1:
            boolean re = true;
            for (int x = 0; x < arr_value.length; x++) {
                    rendom = (int)(Math.random() * arr_value.length);
                        arr_value[rendom] = "";
                        if (rendom < arr_value.length - (x+1) && arr_value[rendom] != "") {
                            for (int i = 0; i < arr_value.length; i++) {
                                if (arr_value[i] == "" && i != arr_value.length-1) {
                                    String mov = arr_value[i];
                                    arr_value[i] = arr_value[i+1];
                                    arr_value[i+1] = mov;
                                }
                            }
                        }
                }
                    break;
                    case 2:
                    System.out.println(Arrays.toString(arr_value));
                    return;
            
                    default:
                    System.out.println("EROR! || pick either 1 or 2");
                    break;
            }
    }

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
                    spin();
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
}