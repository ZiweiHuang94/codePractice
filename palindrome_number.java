//Your runtime beats 21.95 % of java submissions
class Solution {
    public boolean isPalindrome(int x) {
        int left;
        ArrayList<Integer> list = new ArrayList<>();
        if(x<10 && x>-1){
            return true;
        }
        if(x<0){
            return false;
        }
        while(x!=0){
            left = x % 10;
            x = x / 10;
            list.add(left);
        }
        int length = list.size();
        for(int i=0; i<(length/2); i++){
            if(list.get(i)!=list.get(length-i-1)){
                return false;
            }
        }
        return true;
    }
}