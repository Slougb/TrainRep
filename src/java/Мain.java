import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Мain {

    public static void main(String[] args) {
        System.out.println("Два числа через пробел : ");
        result ();

    }
    public static void result () {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a>b) {
            System.out.println("Первое число больше второго");
        } else if (a<b) {
            System.out.println("Второе число больше первого");
        } else {
            System.out.println("Числа равны");
        }
    }


}