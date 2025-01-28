import java.util.Scanner;

public class ConditionalStats {
    public static void main(String[] args) {
        //minage = 18;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age in completed years");
        int age = sc.nextInt();

        if(age <  18){
            System.out.println("Driving License cannot be issued");
        }
        else{
            System.out.println("Driving License can be issued");
        }
        sc.close();
    }
}
