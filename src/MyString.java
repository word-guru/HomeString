import java.util.Arrays;

public class MyString {
    public boolean palindromeCheck(String str){
        String temp = str.toLowerCase();
        String rev = new StringBuilder(temp).reverse().toString();
        return rev.equals(temp);
    }
    public int isVowel(String str){
        char[]temp = str.replaceAll("[^a-zA-Z]","").toLowerCase().toCharArray();
        char[]ch={'a','e','i','o','u'};
        int res = 0;
        for (char letter : temp) {
            for (char vowel : ch) {
                if (letter == vowel) {
                    res++;
                }
            }
        }
        return res;
    }
    public int consonants(String str){
        char[]temp = str.replaceAll("[^a-zA-Z]","").toLowerCase().toCharArray();
        return temp.length - isVowel(str);
    }
    public int entry(String str,String word){
        return (int) Arrays.stream(str.split(" ")).filter(s -> s.contains(word)).count();
    }
}
