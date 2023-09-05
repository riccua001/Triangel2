public class Triangel2 {
    public static void main(String[] args) {
        int a , b, c;
        double omkrets, s, area;
        a = 10;
        b = 5;
        c = 6;
        omkrets = a+b+c;
        s = omkrets/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area = "+ area);
    }
}
