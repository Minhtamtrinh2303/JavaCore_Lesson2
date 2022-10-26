import java.util.Scanner;

public class Lesson2_hw2 {
    public static void main(String[] args) {
        //Giải và biện luận phương trình bậc hai ax2 + bx + c = 0,
        // a, b và c nhập vào từ bàn phím, a khác 0.
        Scanner input = new Scanner(System.in);
        System.out.print("a=");
        double a = input.nextDouble();  // a khác 0
        System.out.print("b=");
        double b = input.nextDouble();
        System.out.print("c=");
        double c = input.nextDouble();
        double denta = b*b - 4*a*c;   // Tính denta
        double D = Math.sqrt(denta); // khai căn
        double x1 = (-b + D) / (2*a);
        double x2 = (-b - D) / (2*a);
        double x = -b/(2*a);
        String result = ( D > 0 ) ? " The equation has two distinct solutions: " +x1+" and"+x2
                : ( D == 0 ) ? " The equation has only one solution:" +x : "The equation has no solution.";
        System.out.println(result);
    }
}
