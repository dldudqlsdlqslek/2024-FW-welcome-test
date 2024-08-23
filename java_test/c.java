package java_test;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        int height = s.nextInt();
        s.close();

        if (age < 14 && height < 160){
            System.out.println("O");
        }
        else{
            System.out.println("X");
        }

    }

}