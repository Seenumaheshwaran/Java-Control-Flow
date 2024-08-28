import java.util.*;

public class Main {
    public static void main(String[] args) {
        int i, num = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n > 0) {
            System.out.println("Positive number");
            switch (n) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Not a week based number");
            }
            for (i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            while (n > 0) {
                System.out.print(n + " ");
                n--;
            }
            System.out.println();
            do {
                System.out.print(num + " ");
                num++;
            } while (num < 4);
        } else if (n < 0) {
            System.out.print("Negative number");
        } else {
            System.out.print("Zero");
        }
    }
}