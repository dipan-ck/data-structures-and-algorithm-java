import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args){
       Scanner num = new Scanner(System.in);
       int userInput = num.nextInt();

        int a = 0;
        int b = 1;
       for(int i = 2; i<= userInput; i++){
           int bin = a + b;
            a = b;
            b = bin;
           System.out.println(b);
       }
       System.out.print(b);

    }
}
