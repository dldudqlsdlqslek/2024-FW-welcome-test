package java_test;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner s = new Scanner(System.in);
        String str = s.next();
        s.close();

        if (str.equals("a")||str.equals("e")||str.equals("i")||str.equals("o")||str.equals("u")){
            System.out.println("O");
        } 
        else{
            System.out.println("X");
        }
    }

}