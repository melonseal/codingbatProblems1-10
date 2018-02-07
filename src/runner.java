import java.util.Arrays;
import java.util.*;

public class runner {


    public static void main(String args[]) {
        int[] intArr = new int[4];
        intArr[0] = 1;
        intArr[1] = 6;
        System.out.print(icyHot(101, -3));
        System.out.print(stringSplosion("helloworld!"));
        System.out.print(conCat("hello", "oworld"));
        System.out.print(Arrays.toString(swapEnds(intArr)));
        System.out.print(blueTicket(2, 8, 9));
        System.out.print(evenlySpaced(6, 4, 2));
        System.out.print(sameStarChar("i*i"));
        System.out.print(gHappy("hhhhssggll"));
        System.out.print(Arrays.toString(zeroFront(intArr)));
        System.out.print(Arrays.toString(squareUp(6)));
    }

    //from category warm up 1
    public static boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100));
    }

    //from category warm up 2
    public static String stringSplosion(String str) {
        String returnString = "";
        for(int i = 1; i < (str.length() + 1); i++){
            returnString += str.substring(0, i);
        }
        return returnString;
    }

    //from category string 1
    public static String conCat(String a, String b) {
        String result = a.concat(b);
        if(a.length() > 0 && b.length() > 0 && a.substring(a.length() - 1).equals((b.substring(0, 1)))){
            result = a.concat(b.substring(1));
        }
        return result;
    }

    //from category array 1
    public static int[] swapEnds(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[nums.length - 1];
        result[result.length - 1] = nums[0];
        for(int i = 1; i < (nums.length - 1); i++){
            result[i] = nums[i];
        }
        return result;
    }

    //from category logic 1
    public static int blueTicket(int a, int b, int c) {
        int result = 0;
        if(a + b == 10 || a + c == 10 || b + c == 10){
            result = 10;
        }else if(a - c == 10 || b - c == 10){
            result = 5;
        }
        return  result;
    }

    //from category logic 2
    public static boolean evenlySpaced(int a, int b, int c) {
        int[] list = new int[3];
        list[0] = a;
        list[1] = b;
        list[2] = c;
        Arrays.sort(list);
        return(list[2] - list[1] == list[1] - list[0]);
    }

    //from category string 2
    public static boolean sameStarChar(String str) {
        int starCount = 0;
        int trueStarCount = 0;
        for(int i = 0; i < (str.length() - 1); i++){
            if(str.substring(i, i + 1).equals("*") && i != 0){
                starCount++;
                if(str.substring(i - 1, i).equals(str.substring(i + 1, i + 2))){
                    trueStarCount++;
                }
            }
        }
        return(starCount == trueStarCount);
    }

    //from category string 3
    public static boolean gHappy(String str) {
        int gCount = 0;
        int happyCount = 0;
        if(str.length() == 1 && str.equals("g")){
            gCount++;
        }
        for(int i = 1; i < str.length(); i++){
            if(str.substring(i, i + 1).equals("g")){
                gCount ++;
                if(i == (str.length() - 1) && str.length() >= 3){
                    gCount = gCount + 2;
                }
                if(str.substring((i - 1), i).equals("g")){
                    happyCount ++;
                }
            }
        }
        for(int i = 0; i < (str.length() - 1); i++){
            if(str.substring(i, (i + 1)).equals("g")){
                gCount ++;
                if(i == 0 && str.length() >= 3){
                    gCount = gCount + 2;
                }
                if(str.substring(i + 1, i + 2).equals("g")){
                    happyCount ++;
                }
            }
        }
        return(gCount <= (2 * happyCount));
    }

    //from category array 2
    public static int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int thingsAdded = (nums.length - 1);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                result[thingsAdded] = nums[i];
                thingsAdded --;
            }
        }
        return result;
    }

    //from category array 3
    public static int[] squareUp(int n) {
        int[] result = new int[n * n];
        int thingsAdded = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((thingsAdded - (n * i) + 2) > (n - i)){
                    result[thingsAdded] = n - j;
                }
                thingsAdded++;
            }
        }
        return result;
    }

}
