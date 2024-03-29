package Day2;

import java.util.Scanner;
public class Unit {
    public static void main(String args[]){
        System.out.print("Enter the Digit : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        if (x==1){
            System.out.println("UNIT");
        }
        else if(x==10){
            System.out.println("Ten");
        }
        else if(x==100){
            System.out.println("Hundred");
        }
        else if(x==1000){
            System.out.println("Thousand");
        }
        else{
            System.out.println("The Given input is not a Unit,Ten or Hundred");
        }

    }
}
