//剑指offer 50
public class Offer50 {
    //在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
    public char firstUniqChar(String s) {
        char[] s_chars = s.toCharArray();
        int[] count_char = new int[26];
        for(char s_char:s_chars){
            if(s_char!=' ') {
                int index = (s_char>96)?s_char-97:s_char-65;
                count_char[index]++;}
        }
        for(char s_char:s_chars){
            int index = (s_char>96)?s_char-97:s_char-65;
            if(count_char[index]==1){
                return s_char;
            }
        }
        return ' ';
    }
    
    
}
