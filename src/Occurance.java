public class Occurance {
    public static void main(String[] args){
        int input  = 45565556;
        int count = 0;
        for(int i = 0; input > 0 ; i++){
            int rem  = input % 10;
            if(rem == 6){
                count++;
            }
            input = input/10;
        }
        System.out.print(count);
    }
}
