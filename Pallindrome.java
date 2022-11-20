public class Pallindrome{
    public static void main(String[] args) {
        int num=2892;
        int rem=0;
        int rev=0;
         int num1 = num;
        while(num1!=0){
          rem = num1%10;
          rev = rev *10 +rem;
          num1= num1/10;
        }
        if( rev== num){
            System.out.println("Num is Pallindrome");
        }
        else{
            System.out.println("Num is not Pallindrome");
        }
    }
}