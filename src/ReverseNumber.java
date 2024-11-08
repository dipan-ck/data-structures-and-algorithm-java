public class ReverseNumber {
    public static void main(String[] args) {
     int num = 357245;
     int reversedNum = 0;
     for(int i = 0; num > 0; i++){
         int rem = num % 10;
             reversedNum = reversedNum * 10 + rem;  //suppose reversedNum is 5 then 5 * 10 will become 50 and then 50 + 4 will be 54
         num = num/10;
     }
        System.out.print(reversedNum);
    }
}
