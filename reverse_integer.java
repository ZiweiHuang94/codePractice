class Solution {
    public int reverse(int x) {
        long result = 0;
        boolean sign = false;
        if(x == 0){
            result = 0;
            return (int)result;
        }
        if(x<0){
            sign = true;
        }
        System.out.println(sign);
        x = Math.abs(x);
        int n;
        ArrayList<Integer> nums = new ArrayList<>();
        while(x!=0){
            n = x%10;
            x = x/10;
            nums.add(n);
        }
        System.out.println(nums);
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