import java.util.Scanner;

public class productofaandb {

    public static void product(int a, int b) {
        
        int pro = a * b;
        System.out.println("product: " + pro);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        product(a, b);

        sc.close();
    }
}