import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.print("Enter the limit number: "); //users enter the value
        int n = scan.nextInt();

        for (int i = 1; i <= n; i *= 4) {     //powers of 4
            System.out.println(i);
        }
        for (int k=1 ; k<=n; k *=5 ){       //powers of 4
            System.out.println(k);
        }


    }
}