public class Anagramq {
    public static void main(String[] args){
        String A= "bat";
        String B = "taaaab";
          int Asum=0;
          int Bsum=0;

          for( int i=0;i<A.length();i++){
            Asum= (int)(A.charAt(i));
            Bsum= (int)(B.charAt(i));
          }
          if( Asum==Bsum){
            System.out.print("the strings are anagram");
          }
          else{
            System.out.print("the strings are not anagram");
        }
    }
}
