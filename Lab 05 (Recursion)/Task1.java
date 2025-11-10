import java.util.Scanner;
public class Task1 {

    public static void task1A() {
        int i = 0;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }

    public static void task1B_recursive(int i) {
        if(i>10) return;
        System.out.println(i);
        task1B_recursive(i+1);
    }

    public static void task1C(int n) {
        int i = 0;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }

    public static void task1D_recursive(int i, int n) {
        if(i>n) return;
        System.out.println(i);
        task1D_recursive(i+1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Normal Loop");
        task1A();
        System.out.println("Recursive Loop");
        task1B_recursive(0);

        System.out.println("Normal Loop 1 to N");
        int x = sc.nextInt();
        task1C(x);

        System.out.println("Recursive Loop 1 to N");
        int y = sc.nextInt();
        task1D_recursive(0, y);

        sc.close();
    }
}