import java.util.Scanner;
public class Assainmentdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int n = sc.nextInt();
        int age = n;
        if(n>=18){
            System.out.println("You are valid:"+age);
        }
        else{
            System.out.println("You are not valid:");
        }
    }
}
