// the problem for me is not familiar with roman number rules
// Your runtime beats 4.16 % of java submissions.
class Solution {
    public int romanToInt(String s) {
        int res = 0;
        HashMap<Character,Integer> romanToNatural = new HashMap<>();
        romanToNatural.put('I', 1);
        romanToNatural.put('V', 5);
        romanToNatural.put('X', 10);
        romanToNatural.put('L', 50);
        romanToNatural.put('C', 100);
        romanToNatural.put('D', 500);
        romanToNatural.put('M', 1000);

        int value = 0;
        int preValue = 0;
        for(int i = 0; i < s.length(); i++){
            value = romanToNatural.get(s.charAt(i));
            if(value <= preValue){
                res += value;
            }else{
                res += value - 2 * preValue;
            }
            preValue = value;
        }
        return res;
    }
}

// do not use HashMap
//Your runtime beats 21.56 % of java submissions
class Solution {
    public int romanToInt(String s) {
        int sum=0;
        if(s.indexOf("IV")!=-1){sum-=2;}
        if(s.indexOf("IX")!=-1){sum-=2;}
        if(s.indexOf("XL")!=-1){sum-=20;}
        if(s.indexOf("XC")!=-1){sum-=20;}
        if(s.indexOf("CD")!=-1){sum-=200;}
        if(s.indexOf("CM")!=-1){sum-=200;}
    
        char c[]=s.toCharArray();
        int count=0;
        for(;count<=s.length()-1;count++){
            if(c[count]=='M') sum+=1000;
            if(c[count]=='D') sum+=500;
            if(c[count]=='C') sum+=100;
            if(c[count]=='L') sum+=50;
            if(c[count]=='X') sum+=10;
            if(c[count]=='V') sum+=5;
            if(c[count]=='I') sum+=1;   
        }   
        return sum;
    }
}

// only loop once
// mind the order to read the s
class Solution {
    public int romanToInt(String s) {
        int res = 0;
        char c;
        for(int i = s.length()-1; i >= 0; i--){
            c = s.charAt(i);
            switch(c){
                case 'I': 
                    res += (res >= 5 ? -1 : +1);
                    break;
                case 'V':
                    res += 5;
                    break;
                case 'X':
                    res += (res >= 50 ? -1 : +1)*10;
                    break;
                case 'L':
                    res += 50;
                    break;
                case 'C':
                    res += (res >= 500 ? -1 : +1)*100;
                    break;
                case 'D':
                    res += 500;
                    break;
                case 'M':
                    res += 1000;
                    break;
            }
        }
        return res;
    }
}