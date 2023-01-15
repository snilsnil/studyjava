
//자바에서 키 입력하기위해 반드시 Scanner가 있는 패키지를 참조해야한다.
import java.util.Scanner;

public class hello5 {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력하세요.");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();// 문자열 읽기
        System.out.print("이름은 " + name + ", ");

        String city = scanner.next();// 문자열 읽기
        System.out.print("도시는 " + city + ",");

        int age = scanner.nextInt();// 정수 읽기
        System.out.print("나이는 " + age + "살, ");

        double weight = scanner.nextDouble();// 실수 읽기
        System.out.print("체중인 " + weight + "kg, ");

        boolean isSingle = scanner.nextBoolean();// 논리값 읽기
        System.out.println("독신 여부는 " + isSingle + "입니다.");
        scanner.close();

    }
}
