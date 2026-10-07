public class ReverseingNum {
        public static void main(String [] args){
        int num = 123;
        int sum = 0;

        int lastDigit;

        while(num>0){
            lastDigit = num%10;
            num = num/10;
            sum =sum*10+lastDigit;
        }

        System.out.print(sum);
        
        
    }
    
}
    

