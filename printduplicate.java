public class printduplicate {
    public static void main(String args[]) {
        String str1 = "Maximum and Minimum";  
        int count;  
        int N = str1.length();
        //Converts given string into character array  
        char []str = new char[N];  
        int p=0;
        for( int i=0;i<N;i++){
            str[p]= str1.charAt(i);
            p++;
        }

        //Count the frequency of each character present in the string  
        for(int i = 0; i <str.length; i++) 
        {  
            count = 1;  
            for(int j = i+1; j <str.length; j++) 
            {  
                if(str[i] == str[j] && str[i] != ' ') 
                {  
                    count++;    
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && str[i] != '0')  
                System.out.println(str[i]);  
        }  
    }  
}  
    
