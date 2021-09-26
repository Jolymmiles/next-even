import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer digit = sc.nextInt();
        if (digit % 2 == 0 ) {
            System.out.println(digit + 2);
        } else if(digit % 2 != 0) {
            System.out.print(++digit);
        }
    }
}