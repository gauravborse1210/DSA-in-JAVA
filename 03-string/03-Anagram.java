public class Anagram {

  public static boolean AnagramString(String str1, String str2){
    boolean isAnagram = false;

     if(str1.length() != str2.length()){
        isAnagram = false;
      }

    for(int i = 0; i < str1.length(); i++){
      for(int j = 0; j < str2.length(); j++){
        if(str1.charAt(i) == str2.charAt(j)){
          isAnagram = true;
          break;
        }
      }
    }
    return isAnagram;
  }

  public static void main(String args[]){
    String str1 = "race";
    String str2 = "care";
    System.out.print(AnagramString(str1, str2));
  }
}

