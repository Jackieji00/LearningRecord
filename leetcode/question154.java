
//jianzhi11
class Solution154 {
    public int minArray(int[] numbers) {
        int index=0;
        int low= 0;
        int high=numbers.length-1;
        while(low<high){
            index=(high-low)/2+low;
            if(numbers[index]<numbers[high]){
                high=index;
            }else if(numbers[index]>numbers[low]){
                low=index+1;
            }else{
                if(numbers[high]>=numbers[low]){
                    high--;
                }else{low++;}
            }
            if(numbers[low]<numbers[high]){
                break;
            }
        }
        if(numbers[index]>numbers[low]) index=low;
        if(numbers[index]>numbers[0]) index=0;
        return numbers[index];
    }
}

