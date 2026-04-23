public class countVowelsAndConsonants {

  public static String count(String s){
    int vowels = 0, consonants = 0, digit = 0, specialCharacter = 0;

    s.replaceAll("\\s", "");

    for(int i = 0; i < s.length(); i++){
      char ch = Character.toLowerCase(s.charAt(i));

      if(Character.isLetter(ch)){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
          vowels++;
        }else{
          consonants++;
        }
      }else if(Character.isDigit(ch)){
        digit++;
      }else{
        specialCharacter++;
      }
    }

    return "Vowels = " + vowels + " && " + "Consonants = " + consonants + " && " + "Digits = " + digit + " && " + "Special Character = " + specialCharacter;
  }

  public static void main(String args[]){
    String s = " A1 B@ d  adc ";
    System.out.print(count(s));
    System.out.println("");
  }
}
