
public class vowel {
    public static void main(String[]args){

        String A = " we are LiVIGN in 21st cent@3434"; 
  
        int vowels = 0, consonants = 0, specialCharacters = 0;
  A = A.toLowerCase();
  for(int i = 0; i <A.length(); i++){
      char ch = A.charAt(i);
      if(ch >= 'a' && ch <= 'z'){
      //check if any char is a, e, i, o ,u
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
          vowels++;
      }
      else{
          consonants++;
      }
     }
      else
          specialCharacters++;
  }
  System.out.println("Vowels: " + vowels);
  System.out.println("Consonants: " + consonants);
  System.out.println("Special Characters: " + specialCharacters);
}

    }
