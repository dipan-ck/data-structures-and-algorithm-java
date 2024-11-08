public class Occurrence {
    public static void main(String[] args){
        int input  = 45565556;  //the number we will work with
        int count = 0;   // this count will increase each time the same number is found

        /*
        Whenever we divide a number by 10 the remainder will be always the last number
        in this loop in the first execution we are checking that is the remainder is
        equals 5 if yes then increment the count by 1. and then dividing the number by 10
        it will short the number by one digit from last and again check for remainder
        */
        for(int i = 0; input > 0 ; i++){
            int rem  = input % 10;  //the last number will always be the remainder
            if(rem == 5){
                count++;  //Increasing the count whenever the number 5 is found
            }
            input = input/10;  //this shorts the number by 1 digit each time
        }
        System.out.print(count);
    }
}
