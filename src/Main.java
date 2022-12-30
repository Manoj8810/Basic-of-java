import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // create a scanner object for input
        int num = sc.nextInt();// get input from the user for num
        switch (num % 2) {// this will return either 0 or 1
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
        }
    }
}