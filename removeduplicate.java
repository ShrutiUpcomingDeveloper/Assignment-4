public class removeduplicate {
    public static void main(String args[]) {
        String A = " ABBDDJJJVE"; 
        String B=" ";      
              
        for(int i=0; i<=A.length()-1;i++) {
            int count=0;
            for(int j=0;j<=i;j++) {
                if(A.charAt(i)==A.charAt(j)) 
                    count++;
                if(count >1)
                    break;
            }
            if(count==1) 
                B= B + A.charAt(i);
        }
        System.out.println(B);
    
    }
}