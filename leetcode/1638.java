class Solution {
    public int countSubstrings(String s, String t) {
        int length_s=s.length();
        int length_t=t.length();
        int result=0;
        int substring_start=-1;//记录s上的位置
        int substring_end=-1;
        char[] s_chars = s.toCharArray();
        char[] t_chars = t.toCharArray();
        int index_s = 0;
        int index_t = 0;
        int record_t = -1;
        Boolean findOne = false;//当前字符是否有一个不相等
        while(index_s<length_s&&index_t<length_t){
          // System.out.print("\ns: "+s_chars[index_s]);
          // System.out.println(" t: "+t_chars[index_t]);
          // System.out.println("s: "+index_s+" t: "+index_t);
          if(s_chars[index_s]!=t_chars[index_t]){
            //如果现在字母不相等
            if(findOne){
              //发现第二个不相等的字母，重置所有
              findOne=false;
              index_s=substring_start;
              index_t=record_t;
            }else{
              findOne=true;
              //如果是处于第一个的话
              if(substring_start<0){
                substring_start=index_s;
                record_t=index_t;
                substring_end=index_s;

              }
            }
          }else{
            substring_end++;
            index_s++;
            index_t++;
          }
          if (findOne) {
            result++;
            index_s++;
            index_t++;
          }

          if(index_t>=length_t){
            index_s++;
            index_t=0;
          }
          // System.out.println("\nafter:\nequal_start:"+equal_start+" equal_end: "+equal_end);
          // System.out.println("s: "+index_s+" t: "+index_t);
          //System.out.println("result: "+result);
        }
        return result;

    }
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Please provide two strings as input.");
            return;
        }
        String s = args[0];
        String t = args[1];
        Solution solution = new Solution();
        int ans = solution.countSubstrings(s, t);
        System.out.println(ans);
    }
}
