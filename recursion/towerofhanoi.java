package recursion;

public class towerofhanoi {

    public static void transfer(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk 1 from " + src + " to " + dest);
            return;
        }

        transfer(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        transfer(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 1;
        transfer(n, "S", "H", "D");
    }
}