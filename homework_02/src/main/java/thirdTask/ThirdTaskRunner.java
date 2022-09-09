package thirdTask;

import java.util.*;

public class ThirdTaskRunner {
    public static void main(String[] args) {
        fuzzySearch("car", "ca6$$#_rtwheel"); // true
        fuzzySearch("cwhl", "cartwheel"); // true
        fuzzySearch("cwhee", "cartwheel"); // true
        fuzzySearch("cartwheel", "cartwheel"); // true
        fuzzySearch("cwheeel", "cartwheel"); // false
        fuzzySearch("lw", "cartwheel"); // false
    }

    public static boolean fuzzySearch(String patternStr, String targetStr) {
        char[] checkResultArray = new char[patternStr.length()];
        char[] charsOfPatternStr = patternStr.toCharArray();

        char[] targetChars = targetStr.toCharArray();
        LinkedList<Character> targetListOfChars = new LinkedList<>();
        for (int i = 0; i < targetChars.length; i++) {
            targetListOfChars.add(targetChars[i]);
        }//Заполняю связанный список символами, в котором надо найти целевую строку

        for (int i = 0; i < charsOfPatternStr.length; i++) {
            for (Iterator<Character> iterator = targetListOfChars.iterator(); iterator.hasNext(); ) {
                Character next = iterator.next();
                if (charsOfPatternStr[i] == next) {
                    checkResultArray[i] = next;
                    iterator.remove();
                    break;
                }
                if (charsOfPatternStr[i] != next) {
                    iterator.remove();
                }
            }
        }//Посимвольный пробег по искомому слову и связанному списку

        if (Arrays.equals(checkResultArray, charsOfPatternStr)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
