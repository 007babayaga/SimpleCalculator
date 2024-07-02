import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the first number : " );
       Scanner sc = new Scanner(System.in);
       String i = sc.nextLine();
       int x = Integer.parseInt(i);
        System.out.println("Enter the second number : " );
        Scanner sce = new Scanner(System.in);
        String j = sc.nextLine();
        int y = Integer.parseInt(j);
        System.out.println("Enter the operation to be performed: " );
        Scanner ch = new Scanner(System.in);
        String chr = ch.nextLine();
        char f = Character.parseCha
          int u = switch (chr){
            case "add"-> x+y;
            case "Subtarct" -> x-y;
            case "Multiply" -> x*y;
            case "Remainder " -> x%y;
            case "divide" -> x/y;
            default -> 0;
        };
          System.out.println(u);
        System.out.println(u);
    }
}
