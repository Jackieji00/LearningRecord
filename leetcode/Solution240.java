class Solution240 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        Boolean result = false;
        
        
        //method1 二分
        //在一个 n * m 的二维数组中，每一行都按照从左到右 非递减 的顺序排序，
        //每一列都按照从上到下 非递减 的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
        int low = 0;
        int high = matrix.length-1;
        int mid;
        while(low<high){
            mid = (high-low)/2+low;
            if(mid>=matrix.length) break;
            int innerLow = 0;
            int innerHigh = matrix[mid].length-1;
            int innermid;
            while(innerLow<innerHigh){ 
                innermid=(innerHigh-innerLow)/2+innerLow;
                if(matrix[mid][innermid]==target) return true;
                else if(matrix[mid][innermid]>target){
                    innerHigh=innermid;
                }else{
                    innerLow=innermid+1;  
                }
                if(innerLow>=innerHigh){
                    high = (matrix[mid][innerHigh]<target) ?high+2:high-2;
                }
            }
        }
        return result;
    }
}