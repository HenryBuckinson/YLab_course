package thirdTask;

public class ThirdTaskRunner {
    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel"));   //true
        System.out.println(fuzzySearch("cwhl", "cartwheel"));   //true
        System.out.println(fuzzySearch("cwhee", "cartwheel"));  //true
        System.out.println(fuzzySearch("cartwheel", "cartwheel"));  //true
        System.out.println(fuzzySearch("cwheeel", "cartwheel"));    //false
        System.out.println(fuzzySearch("lw", "cartwheel")); //false

    }

    public static boolean fuzzySearch(String patternStr, String targetStr) {
        if (patternStr == null | targetStr == null) {
            return false;
        }
        char[] patternArray = patternStr.toCharArray();
        char[] targetArray = targetStr.toCharArray();
        for (int i = 0, j = 0; i < targetArray.length - 1; i++) {
            if (patternArray[j] == targetArray[i]) {
                j++;
            }
            if (j == patternArray.length - 1) {
                return true;
            }
        }
        return false;
    }
}
