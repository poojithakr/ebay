public class StringUtils {

    /*
    * Implement utility class StringUtils with static method shiftString(input, times), and return shifted string.
    * E.g. input: “abcdefghijklmnopqrstuvwxyz”, shift right 2 times, the result is: “yzabcdefghijklmnopqrstuvwx”*/

    public static void main(String[] args){
        String result=shiftString("abcdefghijklmnopqrstuvwxyz",0);
        System.out.println(result);
    }

    static  String shiftString(String input, int times){
        if(times>input.length()){
            return null;
        }
        StringBuffer sb = new StringBuffer();
        int len = input.length();
        sb.append(input.substring(len-times,len));
        sb.append(input.substring(0,len-times));
        return sb.toString();
    }
}
