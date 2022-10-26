import java.util.Scanner;

public class Lesson2_hw1 {
    public static void main(String[] args) {
        // giải và biện luận phương trình bậc nhất ax + b = 0
        // a và b nhập từ bàn phím
        Scanner input = new Scanner(System.in);
        System.out.print("a=");
        double a = input.nextDouble();
        System.out.print("b=");
        double b = input.nextDouble();
        String result = (a != 0) ? " The equation has one solution: " + (-b / a) : (b != 0) ?
                " The equation has no solution. " : " The equation has infinite solutions.";
        System.out.println(result);
    }
}
