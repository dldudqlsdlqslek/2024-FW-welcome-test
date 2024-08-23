package java_test;
import java.util.Scanner;

class Fan{
    private String model;
    private int price;

    public Fan(String model, int price){
        this.model = model;
        this.price = price;
    }
    public String getModel(){
        return model;
    }
    public int getPrice(){
        return price;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

public class f1 {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner s = new Scanner(System.in);

        String model_A = s.next();
        int price_A = s.nextInt();
        String model_B = s.next();
        int price_B = s.nextInt();
        String model_C = s.next();
        int price_C = s.nextInt();

        Fan a = new Fan(model_A, price_A);
        Fan b = new Fan(model_B, price_B);
        Fan c = new Fan(model_C, price_C);
        s.close();
        
        Fan min = a;
        if (min.getPrice() > b.getPrice()){
            min = b;
        }
        if (min.getPrice() > c.getPrice()){
            min = c;
        }

        System.out.println(min.getModel());
    }

}