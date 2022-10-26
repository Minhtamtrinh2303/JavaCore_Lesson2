import java.util.Scanner;

public class Lesson2_hw5_2 {
    public static void main(String[] args) {
        //Nhập 3 xâu ký tự s, s1, s2. Tìm tất cả những lần xuất hiện của s1 trong s và thay thế bằng s2. Xuất s ra màn hình.
        //Ví dụ: s = “TIM KIEM VA THAY THE”, s1 = “TH”, s2 = “123”. Kết quả xâu ký tự s sẽ là: “TIM KIEM VA 123AY 123E”
        Scanner input = new Scanner(System.in);
        System.out.print("s=");
        String s = input.nextLine();
        System.out.print("s1=");
        String s1 = input.nextLine();
        System.out.print("s2=");
        String s2 = input.nextLine();
        System.out.println("Result = " +s.replace(s1,s2));
    }
}
