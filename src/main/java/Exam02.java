import java.util.Scanner;

public class Exam02 {
    public static void main(String[]  args){
        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 ==> ");
        int num = s.nextInt();

        if (num % 3 == 0 && num % 5 == 0)  {
            System.out.println("3과 5의 배수 둘 다 만족합니다.");
        } else if (num % 3 == 0) {
            System.out.println("3의 배수 입니다.");
        } else if (num % 5 == 0) {
            System.out.println("5의 배수 입니다.");
        } else {
            System.out.println("3의 배수도 5의 배수도 아닙니다.");
        }
    }
}
