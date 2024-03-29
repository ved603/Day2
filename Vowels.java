package Day2;
import java.util.Scanner;
public class Vowels{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character : ");
        char x = sc.next().charAt(0);
        sc.close();
        switch(x){
            case 'a':
                System.out.println("Vowels");
                break;
            case 'e':
                System.out.println("Vowels");
                break;
            case 'i':
                System.out.println("Vowels");
                break;
            case 'o':
                System.out.println("Vowels");
                break;
            case 'u':
                System.out.println("Vowels");
                break;
            default:
                System.out.println("Consonanat");
                break;
    }
}
}
