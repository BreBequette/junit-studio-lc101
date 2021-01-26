package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */

//  ORIGINAL CODE:
//    public static boolean hasBalancedBrackets(String str) {
//        int brackets = 0;
//        for (char ch : str.toCharArray()) {
//            if (ch == '[') {
//                brackets++;
//            } else if (ch == ']') {
//                brackets--;
//            }
//        }
//        return brackets == 0;
//    }

    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        char lastBracket = 'a';
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
                lastBracket = '[';
            } else if (ch == ']') {
                if (lastBracket == '['){ //keep an even num of brackets
                    brackets--;
                } else if (brackets < 0){ //if a closing bracket doesn't follow open bracket, return false
                    return false;
                } else {
                    brackets++;
                }

            }
        }

        if (brackets == 0){
            return true;
        } else {
            return false;
        }
    }//end hasBalancedBrackets method
}//end BalancedBrackets class
