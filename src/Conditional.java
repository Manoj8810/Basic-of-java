import java.util.*;
public class Conditional {
    public static void main(String args[]){
        //Conditional Statement in java
          Scanner sc = new Scanner(System.in);

        // First Code************** if else ***************

        //   int age = sc.nextInt();
        //   if(age > 18){
        //     System.out.println("Adult");
        //   }
        //   else{
        //     System.out.println("Not a adult");
        //   }

        //Second code************ % Modulo operater // Evem Odd number ***************

        /* int x = sc.nextInt();
        if(x % 2 ==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        } */

        //Third code**************** if, else if, else *************

        // int a = sc.nextInt(); 
        // int b = sc.nextInt(); 

        // if(a == b){
        //     System.out.println("Equal");
        // }
        // else if(a > b){
        //     System.out.println("a is greater");
        // }
        // else{
        //     System.out.println("a is lesser");
        // }

        //Fourth code********Switch statement********************

        int button = sc.nextInt();
        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invaid button");
        }
    }
}
