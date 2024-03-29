package Day2;
import java.util.Scanner;
public class Read {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Single Digit Number : ");
        int x = sc.nextInt();
        sc.close();
        if(x==0){
            System.out.println("Zero");
        }
        else if(x == 1){
            System.out.println("One");
        }   
        else if(x==2){
            System.out.println("Two");
        }
        else if(x==3){
            System.out.println("Three");
        }
        else if(x==4){
            System.out.println("Four");
        }
        else if(x==5){
            System.out.println("Five");
        }
        else if(x==6){
            System.out.println("Six");
        }
        else if(x==7){
            System.out.println("Seven");
        }
        else if(x==8){
            System.out.println("Eight");
        }
        else if(x==9){
            System.out.println("Nine");
        }
        else{
            System.out.println("The Number is Not a Two Digit");
        }
}
}
