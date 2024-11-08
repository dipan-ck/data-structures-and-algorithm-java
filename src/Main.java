import java.util.Arrays;

class Main{
    public static void main(String[] args){
       int num = 5;
        for(int i = 1; i<= num; i++){
            String ch = "";
            for(int j = 1; j<= i; j++){
                ch += "*";
            }
            System.out.println(ch);
        }
    }
}