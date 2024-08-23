package java_test;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        int result = 0;
        result += n/100;
        result += ((n%100)/10)*10;
        result += (n%10)*100;
        System.out.println(result);
    }

}