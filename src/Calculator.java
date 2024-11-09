import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double ans = 0;
        System.out.print("Select the operands:");
        Scanner ch = new Scanner(System.in);
        char userInp = ch.next().trim().charAt(0);
        if(userInp == '+' || userInp == '-' || userInp == '*' || userInp == '/'){
            System.out.print("Give two Numbers");

            Scanner num1 = new Scanner(System.in);
            Scanner num2 = new Scanner(System.in);

            double numOne = num1.nextInt();
            double numTwo = num2.nextInt();

            if(userInp == '+'){
                ans = numOne + numTwo;
            }else if(userInp == '-'){
                ans  = numOne - numTwo;
            }else if(userInp == '*'){
                ans = numOne * numTwo;
            }else if(userInp == '/'){
                if(numTwo == 0){
                    ans = 0;
                }else{
                    ans = numOne/numTwo;
                }
            }
            System.out.print(ans);
        }else{
            System.out.println("Enter a Valid Operand");
        }
    }
}

