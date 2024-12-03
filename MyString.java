public class MyString {
    public static void main(String[] args) {
        // System.out.println("Testing lowercase:");
        // System.out.println("UnHappy : " + lowerCase("UnHappy"));
        // System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        // System.out.println("TLV : " + lowerCase("TLV"));
        // System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
        // System.out.println(isEquals("hua", "hua"));
        // System.out.println(isEquals("iraa", "ira"));

        
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++){
           if (str.charAt(i) >= 65 && str.charAt(i) <= 90){
              newStr += (char)(str.charAt(i) + 32);
           } else{
            newStr += str.charAt(i);
           }
        }
        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (isEquals(str1, str2)){
            return true;
        }

        if (str1.length() > str2.length()){
            
            for (int i = 0; i < str1.length(); i++){
 
                if (str1.charAt(i) == str2.charAt(0)){
                    String tester = "";
                    int index = i;
                    for (int j = 0; j < str2.length(); j++){
                        if (index == str1.length()){
                            return false;
                        }
                        tester += str1.charAt(index);
                        index++;
                    }

                    if (isEquals(tester, str2)){
                        return true;
                    }
                }
            }
        } 
        
        return false;
    }

    public static boolean isEquals(String str1, String str2) {
        if (str1.length() == str2.length()){
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)){
                    return false;
                }
            }
            return true;
        } 
        return false;
    }
    
    
}
