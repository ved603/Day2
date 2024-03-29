// Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
package Day2;
import java.util.Scanner;
public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();
        sc.close();
        int i=0;
        int sum = 0;
        while(i<=x){
            sum += i;
            i++;
        }
        System.out.println("The Sum of Numbers is : " +sum);
    }
}
