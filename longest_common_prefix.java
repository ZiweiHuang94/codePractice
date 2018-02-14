class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        if(strs.length == 0){
            return "";
        }
        if(strs == null){
            return "";
        }
        int minLength = strs[0].length();
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() < minLength){
                minLength = strs[i].length();
            }
        }
        for(int j = 0; j < minLength; j++){
            for(int i = 1; i < strs.length; i++){
                if( strs[0].charAt(j) != strs[i].charAt(j)){
                    return res;
                }
            }
            res += strs[0].charAt(j);
        }
        return res;
    }
}