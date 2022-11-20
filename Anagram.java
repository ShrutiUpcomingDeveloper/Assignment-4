public class Anagram {
    public static void main(String[] args){
    String A= "bat";
    String B = "taaaab";
      int N =256;
        int []count= new int [N];
int Hyder=0;

        if(A.length()!=B.length()){
            Hyder =0;
            if(Hyder==0){
            System.out.print("the given strings are not anagram");
            }
        }
        Hyder=0;
        for( int i=0;i<A.length();i++){
            int index= (int)A.charAt(i);
            int index1= (int) B.charAt(i);
                    count[index]++;
            count[index1]--;
        }
        for( int i=0;i<N;i++){
            if(count[i]!=0){
            Hyder=2;
                if(Hyder==2){
                    System.out.print("the given strings are not anagram");
                    }
            }
        }
        if(Hyder==1){
        System.out.print("the given strings are anagram");
    }
    }
}

