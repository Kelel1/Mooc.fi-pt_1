
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int fi = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int la = Integer.parseInt(reader.nextLine());
        while (fi <= la) {
            System.out.println(fi);
            fi++;
        }// write your code here

    }
}
