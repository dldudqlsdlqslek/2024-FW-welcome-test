package java_test;
import java.util.Scanner;

public class d {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner s = new Scanner(System.in);

        while (true){
            int n = s.nextInt();
            if (n <= 0){
                System.out.println("X");
            }
            else{
                int sum = 0;
                for(int i = 1; i <= n; i++){
                    sum += i;
                }
                System.out.println(sum);
                break;
            }
        }
        s.close();

    }

}