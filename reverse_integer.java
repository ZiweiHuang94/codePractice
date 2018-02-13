class Solution {
    public int reverse(int x) {
        long result = 0; // need to put long here!!! not int!!! because there is problem about overflow!!!
        boolean sign = false;
        if(x == 0){
            result = 0;
            return (int)result;
        }
        if(x<0){
            sign = true;
        }
        x = Math.abs(x);
        int n;
        ArrayList<Integer> nums = new ArrayList<>();
        while(x!=0){
            n = x%10;
            x = x/10;
            nums.add(n);
        }
        int l = nums.size();
        for(int i=0; i<(l-1); i++){
            result = (int) (result + Math.pow(10,l-i-1)*nums.get(i));
        }
        result = result + nums.get(l-1);
        System.out.println(result);
        long resultLong = (Math.abs((long)(result)));
        System.out.println(result);
        if(resultLong>Integer.MAX_VALUE){
            result = 0;
        }
        if(sign){
            result = -result;
        }
        return (int)result;
    }
}

// solution 2
// Your runtime beats 34.75 % of java submissions.
class Solution {
    public int reverse(int x) {
        long result = 0;
        if(x==0){
            return 0;
        }
        boolean sign = true;
        if(x<0){
            sign = false;
        }
        while(x!=0){
            result = result * 10 + x % 10;
            x = x / 10;
        }
        result = Math.abs(result);
        if(result > Integer.MAX_VALUE){
            return 0;
        }
        if(!sign){
            result = -result;
        }
        return (int)result;       
    }
}