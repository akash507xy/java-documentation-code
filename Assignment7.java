import java.util.Scanner;

 class AssignmentDemo9 {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you love java?");
        ch = sc.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            System.out.println("You love Java!");
        } else if (ch == 'N' || ch == 'n') {
            System.out.println("You do not love Java!");
        } else {
            System.out.println("Invalid input. Please enter Y/y or N/n.");
        }

        sc.close();
    }
}
