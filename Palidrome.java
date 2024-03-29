package Day2;
import java.util.Scanner;
public class Palidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();
        sc.close();
        int temp = 0;
        int n = x;
        while(x>0){
            int rem = x % 10;
            temp = (temp*10) + rem;
            x /= 10;
        }
        System.out.println("The input is :  " +n+ "  and the Sum is : " +temp);
        if(n == temp){
            System.out.println("The Given Number is Palidrome");
        }
        else{
            System.out.println("The Given Number is Not a Palidrome");
        }

    }
}
