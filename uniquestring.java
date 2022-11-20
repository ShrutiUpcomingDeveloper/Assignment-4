public class uniquestring {
        public static boolean checkUnique(String str) {
            int i=0,j=str.length()-1;
            while(i<j) {
                if(str.charAt(i) == str.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
        public static void main(String[] args) {
            String str = "xyz";
            System.out.println("Original String : "+str);
            System.out.println("String has all unique characters: "+ checkUnique(str));
        }		
    }
    
