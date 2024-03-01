

import java.util.List;

public class stringPr {
    static String reverse;
    static List<String> palindromeString;

    public static String reverse(String rev) {

        for (int i = 0; i < rev.length(); i++) {
            reverse = String.valueOf(rev.charAt(rev.length() - i));
        }
        return rev;
    }

    public static List<String> getPlaindromList(String str) {//racecarannakayak
        String temp = "";
        if (str.length() == 1) {
            System.out.println("palindrome string is" + str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                for (int j = i+1; j < str.length(); j++) {
                    int[] a =new int[2];
                    temp = temp.substring(i, j );
                    String s = reverse(temp);
                    if (s.equals(temp)) {
                        palindromeString.add(temp);
                    }
                }

            }

        }
        return palindromeString;

    }


    public static void main (String[] args){
        String str=   "racecarannakayak" ;

        List<String> finalString= getPlaindromList(str);
        System.out.print("palindromeString sets are"+finalString);
    }
}
