import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("multiplication table");
        String x="";
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            System.out.println("------------------------------------------------------------");
            for (int j = 1; j <= 9 ; j++) {
                System.out.print("|"+i+"*"+j+"="+j*i);
            }
        }
    }
}
