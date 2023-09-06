import java.util.Scanner;

public class Triangel2 {
    public static void main(String[] args) {
        //
        Scanner tgb = new Scanner(System.in);
        int a , b, c;
        double omkrets, s, area;
        a = tgb.nextInt();
        b = tgb.nextInt();
        c = tgb.nextInt();
        omkrets = a+b+c;
        s = omkrets/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("Omkrets = %.3f \nArea = %.2f",omkrets, area);
    }
}
