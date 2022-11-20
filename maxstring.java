public class maxstring {
    public static void main(String args[]) {
        String str = "Maximum and Minimum";  
        int N = 256;
        //Converts given string into character array  
        int []count= new int[N];  
       
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
      }
      int max=0;
      char result = ' ';
       for( int i=0;i<str.length();i++){
           if(max< count[str.charAt(i)]){
             max= count[str.charAt(i)];
             result = str.charAt(i); 

           }
       }
       System.out.print("The max occuring character is "+ result);
    }
}


